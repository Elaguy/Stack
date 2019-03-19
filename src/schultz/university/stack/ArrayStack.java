package schultz.university.stack;

public class ArrayStack {
	
	private int[] data;
	private int top;
	
	public ArrayStack() {
		data = new int[4];
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void push(int element) {
		if(top + 1 <= data.length-1) {
			top++;
			data[top] = element;
		}
		
		else
			System.out.println("Cannot push, stack is full!");
	}
	
	public int pop() {
		if(isEmpty())
			return -1;
		
		int result = data[top];
		
		data[top] = 0;
		top--;
		
		return result;
	}
	
	public String toString() {
		if(isEmpty())
			return "Stack is empty!";
		
		String result = "";
		
		for(int i = top; i >= 0; i--)
			result += data[i] + "\n";
		
		return result;
	}
}
