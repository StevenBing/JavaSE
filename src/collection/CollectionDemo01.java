package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * java.until.Collection Collection是所有集合的顶级接口，规定了所有集合都应该具备的方法。 其下有两个派生接口:
 * java.until.List:可重复集合，并且有序。 java.until.Set:不可重复集合。
 * 重复指的是元素是否可以重复，而重复的标准是元素自身equals比较的结果是否为true。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 19:48
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);

		System.out.println(list.size());

		System.out.println(list.isEmpty());

		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
}
