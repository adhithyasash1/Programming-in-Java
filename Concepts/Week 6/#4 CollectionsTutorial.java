/*
ArrayQueue
*/


public class ArrayQueue {
	
	private int head;
	private int tail;
	private int count;
	private Integer []queue;
	
	private static final int QUEUE_SIZE = 16;
	
	public ArrayQueue() {
		queue = new Integer[QUEUE_SIZE];
		head = tail = count = 0;
	}
	
	public ArrayQueue(int size) {
		queue = new Integer[size];
		head = tail = count = 0;
	}
	
	public boolean add(Integer data) {
		if (isFull()) {
			return false;
		}
		
		queue[tail] = data;
		tail++;
		
		if (tail == queue.length) {
			tail = 0;
		}
		
		count++;
		return true;
	}
	
	public Integer remove() {
		if (isEmpty()) {
			return null;
		}
		
		Integer tmp = queue[head];
		head++;
		
		if (head == queue.length) {
			head = 0;
		}
		
		count--;
		return tmp;
		
	}
	
	public boolean isFull() {
		return (count == queue.length);
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		String rtn = "";
		rtn += "count = " + count + "\n";
		rtn += "head  = " + head + "\n";
		rtn += "tail  = " + tail + "\n";
		
		if (isEmpty()) {
			return "<empty>";
		}
		int tmp = head;
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				rtn += "head -> ";
			} else {
				if (i == count-1) {
					rtn += "tail -> ";
				} else {
					rtn += "        ";
				}
			}
			
			rtn += queue[tmp++] + "\n";
			
			if (tmp == queue.length) {
				tmp = 0;
			}
			
		}
		
		return rtn;
	}

}

/*
Linked Queue
*/


public class LinkedQueue {

	private Node head;
	private Node tail;
	private int count;
	
	public boolean add(Integer data, Integer arrivaltime) {
		
		Node n = new Node(data);
		n.setArrivalTime(arrivaltime);

		if (count == 0) {
			// The queue is empty
			head = tail = n;
		} else {
			tail.setNext(n);
			tail = n;
		}
		
		count++;
		return true;
	}
	
	public Integer remove() {
		Integer tmp;
		if (isEmpty()) {
			return null;
		} else {
			tmp = head.getData();
			if (count == 1) {
				head = tail = null;
			} else {
				head = head.getNext();
			}

			count--;
		}
		
		
		return tmp;
	}
	
	public Node getHeadElement() {
		if (isEmpty()) {
			return null;
		} else {
			return head;
		}
	}
 	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		String rtn = "";

		if (isEmpty()) {
			return "<empty>";
		}
		
		Node tmp = head;
		while(tmp != null) {
			rtn += tmp.getData();
			tmp = tmp.getNext();
			if (tmp != null) {
				rtn += " -> ";
			}
		}
		return rtn;
	}
}

/*
Node
*/


public class Node {
	private Integer data;
	private Node next;
	private Integer arrivaltime;

	public Node(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getArrivalTime() {return arrivaltime;}
	public void setArrivalTime(Integer arrivaltime) {this.arrivaltime = arrivaltime;}
}