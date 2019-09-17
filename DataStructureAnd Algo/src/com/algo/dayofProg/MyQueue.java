package com.algo.dayofProg;

import java.util.Stack;

public class MyQueue {
	// int[] pushAray= new int[10];
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		MyQueue  myQueue= new MyQueue();
		myQueue.push(30);
		myQueue.push(32);
		myQueue.push(33);
		
		myQueue.pop();
		myQueue.push(34);
		//System.out.println(myQueue);

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
//		 if(stack1.isEmpty())
//			 stack1.push(x);
//		 
		while (!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
		stack1.push(x);
		
		while (!stack2.isEmpty()) {
			int pop = stack2.pop();
			stack1.add(pop);
		}
		System.out.println(stack1);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return stack1.pop();

	}

	/** Get the front element. */
	public int peek() {
		return stack1.peek();

	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return false;

	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */