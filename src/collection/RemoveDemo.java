package collection;

import java.util.ArrayList;

/**
 * 删除集合元素操作
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 20:18
 */
public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<>();
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));
        list.add(new Point(7, 8));
        /*
        * 根据equals方法进行删除元素。
        * */
        list.remove(new Point(1, 2));
        System.out.println(list);
    }
}
