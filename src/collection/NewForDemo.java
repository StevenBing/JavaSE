package collection;

import java.util.ArrayList;

/**
 * 新循环自JDK5之后推出的一个新特性 新循环是用来遍历集合和数组使用的有被称为增强for循环，for each
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 10:29
 */
public class NewForDemo {
	public static void main(String[] args) {
		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("java");
		stringArrayList.add("cpp");
		stringArrayList.add("php");
		stringArrayList.add("android");
		for (String str : stringArrayList) {
			str = "sss";
		}
		System.out.println(stringArrayList);
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 2));
		list.add(new Point(3, 4));
		list.add(new Point(5, 6));
		list.add(new Point(7, 8));
		list.add(new Point(9, 10));
		/*
		* 新循环遍历集合时，不能使用集合的方法修改集合。
		* */
		for (Point point : list) {
			point.setX(88);
		}
		System.out.println(list);
	}
}
