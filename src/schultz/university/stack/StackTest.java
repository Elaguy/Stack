package schultz.university.stack;

public class StackTest {

	public static void testLinkedListStack() {
		LinkedListStack stack = new LinkedListStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
	}
	
	public static void testArrayStackChar() {
		ArrayStackChar stack = new ArrayStackChar();
		
		stack.push('A');
		stack.push('B');
		stack.push('C');
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
	}
	
	public static void testArrayStack() {
		ArrayStack stack = new ArrayStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
	}
	
	public static void main(String[] args) {
		System.out.println("LinkedListStack: ");
		
		testLinkedListStack();
		
		System.out.println("\nArrayStackChar:");
		
		testArrayStackChar();
		
		System.out.println("\nArrayStack:");
		
		testArrayStack();
	}

}