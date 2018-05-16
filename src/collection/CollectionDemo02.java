package collection;

import java.util.ArrayList;

/**
 * 集合存放的是元素的引用
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 20:00
 */
public class CollectionDemo02 {
    public static void main(String[] args) {

        ArrayList<Point> list = new ArrayList<>();
        Point point = new Point(1,2);
        list.add(point);
        System.out.println("list: " + list);
        System.out.println("point: " + point);

        point.setX(2);
        System.out.println("list: " + list);
        System.out.println("point: " + point);

        list.clear();
        System.out.println(list.isEmpty());
    }
}
