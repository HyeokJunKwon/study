package ch03;

import java.util.Stack;

public class Q3_4 {
	public static void main(String[] args) {
		myQueue myq = new myQueue();
		myq.enqueue(1);
		myq.enqueue(2);
		System.out.println(myq.dequeue());
		myq.enqueue(3);
		System.out.println(myq.dequeue());
	}
	
	static class myQueue {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		
		void enqueue(int num) {
			st1.push(num);
		}
		
		int dequeue() {
			if (st2.isEmpty()) {
				while (st1.isEmpty() == false) {
					st2.push(st1.pop());
				}
			}
			return st2.pop();
		}
	}
}
