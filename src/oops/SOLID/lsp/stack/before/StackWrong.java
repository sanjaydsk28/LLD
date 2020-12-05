package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
/*
 * Stack is-a list with push() pop() methods.
 * So can we create a stack by extending an ArrayList class?
 * 
 * No! This implementation violates the Liskov Substitution Principle.
 * Which states that 
 * "Objects in a program should be replaceable with instances of their subtypes
 * without altering the correctness of that program."
 * 
 * In this case ArrayList has multiple methods which stack is not supposed to have (ex clear(), get(i) etc)
 * so objects of ArrayList are not fully replaceable by the objects of stack.   
 * 
 */
public class StackWrong {
	private int topPointer = 0;
	ArrayList<Integer> stack;
	StackWrong() {
		this.stack = new ArrayList<>();
	}

	public void push(Integer a) {
		stack.add(a);
		topPointer++;
	}	
	public void pop() {
		stack.remove(topPointer-1);
		topPointer--;
	}
	public Integer top() {
		if (stack.size() != 0)
			return stack.get(topPointer-1);
		return -1;
	}

	public  void clear() {
		stack.clear();
	}

}
