package myStack;

public class StackDemo {

	public static void main(String[] args) {
		
		runDemo(new ArrayDequeStack<>());
		
	}
	
	private static void runDemo(Stack<Integer> stack) {
		System.out.println("--------" + stack.getClass().getSimpleName() + "--------");
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Stack.peek() -> " + stack.peek());
		
		System.out.println("Stack.pop() -> " + stack.pop());
		System.out.println("Stack.pop() -> " + stack.pop());
		System.out.println("Stack.pop() -> " + stack.pop());
		
		try {
			System.out.println("Stack.pop() -> " + stack.pop());
		}catch(Exception ex) {
			ex.printStackTrace(System.out);
		}
		
		
	}
	
	
}
