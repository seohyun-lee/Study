package week10;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		System.out.println("myStack.empty() -> "+myStack.empty());
		myStack.push("1st"); System.out.println(myStack);	//[1st]
		myStack.push("2nd"); System.out.println(myStack);	//[1st, 2nd]
		myStack.push("3rd"); System.out.println(myStack);	//[1st, 2nd, 3rd]
		myStack.push("4th"); System.out.println(myStack);	//[1st, 2nd, 3rd, 4th]
		System.out.println();
		
		System.out.println("myStack.peek() -> "+myStack.peek());
		String element=myStack.pop();
		System.out.println("myStack.pop() -> "+element);
		element=myStack.pop();
		System.out.println("myStack.pop() -> "+element);
	}

}
