package collection;

import java.util.ArrayList;

/**
 * contains(T t):boolean 判断集合中是否包含元素t
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 20:10
 */
public class ContainsDemo {
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(1, 2));
		list.add(new Point(3, 4));
		list.add(new Point(5, 6));
		list.add(new Point(7, 8));
        System.out.println(list);

        /*
        * 集合已有元素和给定元素进行equals比较，如果结果为true那么集合中包含此元素。所以集合的equals方法
        * 直接影响了contains方法的结果。
        * */
        boolean result = list.contains(new Point(1, 2));
        System.out.println("result: " + result);
    }
}
