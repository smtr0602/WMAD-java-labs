package java_collections.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		System.out.println(q); // [0, 1, 2, 3, 4, 5]
		System.out.println("**********");

		int removed = q.remove();
		System.out.println(removed); // 0
		System.out.println(q); // [1, 2, 3, 4, 5]
		System.out.println("**********");

		int head = q.peek();
		System.out.println(head); // 1
		System.out.println(q); // [1, 2, 3, 4, 5]
		System.out.println("**********");

		int size = q.size();
		System.out.println(size); // 5
		System.out.println("**********");

		q.add(10);
		System.out.println(q); // [1, 2, 3, 4, 5, 10]
	}

}
