package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue 队列 队列可以存放一组元素，但是存取必须按照先进先出 原则。 Queue是一个接口，其继承自Collection，所以队列
 * 也具有集合的特性。add,size等方法依然可用。
 *
 * Queue也提供了一组进出对的方法。常用实现类为: java.util.LinkedList
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 9:01
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);

		System.out.println("------poll()------");
		String poll = queue.poll();
		System.out.println(poll);
		System.out.println(queue);

		System.out.println("------peek------");
		String peek = queue.peek();
		System.out.println(peek);

		for (String str : queue) {
			System.out.println(str);
		}
	}
}
