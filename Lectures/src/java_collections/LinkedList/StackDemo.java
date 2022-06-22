package java_collections.LinkedList;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stackList = new Stack<>();

		stackList.push(0);
		stackList.push(1);
		stackList.push(2);
		stackList.push(3);
		stackList.push(4);
		stackList.push(5);
		System.out.println(stackList); // [0, 1, 2, 3, 4, 5]
		System.out.println("**********");

		stackList.pop();
		System.out.println(stackList); // [0, 1, 2, 3, 4]
		System.out.println("**********");

		if (stackList.isEmpty()) // Stack is not empty
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		System.out.println("**********");

		System.out.println(stackList.search(0)); // 5
	}

}
