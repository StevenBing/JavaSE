package collection;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

/**
 * 集合排序
 *
 * 集合的工具类:java.util.Collections
 * 提供了很多静态方法，便于操作集合。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 17:22
 */
public class Collections_sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //乱序
        Collections.shuffle(list);

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(7, 8));
        points.add(new Point(3, 4));
        points.add(new Point(1, 3));
        points.add(new Point(1, 2));
        points.add(new Point(5, 6));
        Collections.sort(points);
        System.out.println(points);
    }
}
