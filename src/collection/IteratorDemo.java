package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection 提供了统一的获取元素的操作：遍历 而遍历集合使用的是迭代器模式: Iterator iterator()
 * 该方法获取一个可以用于遍历当前集合的迭代器。 java.util.Iterator
 * Iterator是一个接口，定义了迭代器遍历集合的相关操作方法，不同的集合都提供了一个迭代器实现类。
 * <p>
 * 迭代器遍历集合遵循:问，取，删的步骤，其中删除元素不是必要操作。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 9:36
 */
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("php");
		list.add("c++");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
            /*
            * 迭代器要求在遍历集合过程中不能通过集合的方法增删元素，否则会抛出异常。
            * 迭代器提供了remove方法进行删除元素，删除的是next()方法遍历出来的元素。
            * */
            iterator.remove();
		}

        System.out.println(list);
	}
}
