package schultz.university.stack;

import schultz.university.linkedlist.LinkedList;
import schultz.university.linkedlist.Node;

public class LinkedListStack {
	
	private LinkedList list;

	public LinkedListStack() {
		list = new LinkedList();
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void push(int element) {
		list.addFirst(element);
	}
	
	public int pop() {
		if(isEmpty())
			return -1;
		
		int result = 0;
		
		result = list.removeFirst();
		
		return result;
	}
	
	public String toString() {
		if(isEmpty())
			return "Stack is empty!";
		
		String result = "";
		
		Node current = list.getHead();
		
		for(int i = 0; i < size(); i++) {
			result += current.getElement() + "\n";
			
			current = current.getNext();
		}
		
		return result;
	}
}
