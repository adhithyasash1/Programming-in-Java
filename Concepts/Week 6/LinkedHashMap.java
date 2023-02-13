/*
Linked HashMap
*/

import java.util.HashMap;


public class LinkedHashMap {
	
	private HashMap<Integer, Node> map;
	private Node head;
	private Node tail;
	
	public LinkedHashMap() {
		map = new HashMap<Integer, Node>();
		head = null;
		tail = null;
	}
	
	public void add(int num) {
		Node node = new Node(num);
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		map.put(num, node);
	}
	
	public void remove(int num){
		Node node = map.get(num);
		if (node.prev == null) head = node.next;
		else node.prev.next = node.next;
		if (node.next == null) tail = node.prev;
		else node.next.prev = node.prev;
		map.remove(num);
	}
	
	public boolean contains(int num) {
		return map.containsKey(num);
	}
	
	public void insertionOrder() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	private class Node {
		
		private Node prev;
		private Node next;
		private int data;
		
		public Node(int data) {
			prev = null;
			next = null;
			this.data = data;
		}
	}

}