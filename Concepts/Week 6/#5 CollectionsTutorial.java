/*
Linked List
*/


public class LinkedList {

  private Node head;

  public void add(int data) {
    if (this.head == null) {
      this.head = new Node(data, null);
    } else {
      Node end = this.head;

      while (end.getNext() != null) {
        end = end.getNext();
      }

      end.setNext(new Node(data, null));
    }
  }

  public void addToFront(int data) {
    this.head = new Node(data, this.head);
  }

  public void printList() {
    Node current = this.head;
    System.out.print("HEAD -> ");

    while (current != null) {
      System.out.print(current);
      System.out.print(" -> ");
      current = current.getNext();
    }

    System.out.println("null");
  }

  // find last element
  public void findLastElement() {
    Node current = this.head;

    while (current.getNext() != null)
      current = current.getNext();

    System.out.println("last element is : " + current.getData());
  }
}

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addToFront(10);
    linkedList.printList();
    linkedList.addToFront(20);
    linkedList.printList();
    linkedList.addToFront(30);
    linkedList.printList();
    linkedList.addToFront(40);
    linkedList.printList();
    linkedList.addToFront(50);
    linkedList.printList();
    linkedList.findLastElement();

    linkedList.add(99);
    linkedList.printList();
  }

}

/*
Node for Linked List
*/

package com.codecafe.datastructures.list.linkedlists.singly.simple;

public class Node {

  private final int data;
  private Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  @Override
  public String toString() {
    return Integer.toString(this.data);
  }

}


/*
Custom ArrayList
*/

import java.util.Arrays;

public class CustomArrayList<E> {

  private static final int INITIAL_CAPACITY = 10;
  private int size = 0;
  private Object[] elements;

  public CustomArrayList() {
    this.elements = new Object[INITIAL_CAPACITY];
  }

  public void add(E e) {
    if (size == elements.length) {
      increaseCapacity(); // double the capacity when full
    }
    elements[size++] = e;
  }

  private void increaseCapacity() {
    int newCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, newCapacity);
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return (E) elements[index];
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Object elementToBeRemoved = elements[index];

    for (int i = index; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }

    size--;
    return elementToBeRemoved;
  }

  public void display() {
    System.out.print("List : ");
    for (int i = 0; i < size; i++) {
      System.out.print(elements[i] + " ");
    }
  }

}

public class CustomArrayListDemo {

  public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);

    list.display();
    System.out.println("\nlist.get(1)" + " : " + list.get(1));

    System.out.println("element removed from index 1" + " : " + list.remove(1));

    list.display();
  }
}

/*

*/