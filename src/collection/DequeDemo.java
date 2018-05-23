package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque 双端队列 Deque接口继承自Queue，双端队列是两端都可以做进出队操作的队列。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 9:06
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.offer("one");
		deque.offer("two");

		deque.offerFirst("three");
		deque.offerLast("four");
		System.out.println(deque);
		System.out.println("\n");

		String poll = deque.poll();
		System.out.println(poll);
		System.out.println("\n");

		String pollFirst = deque.pollFirst();
		System.out.println("pollFirst: " + pollFirst);
		String pollLast = deque.pollLast();
		System.out.println("pollLast: " + pollLast);
		System.out.println("\n");

		deque.offer("ssssssssss");
		System.out.println(deque);
		String peek = deque.peek();
		System.out.println("peek: " + peek);
		System.out.println("peekFirst: " + deque.peekFirst());
		System.out.println("peekLast: " + deque.peekLast());
	}
}
