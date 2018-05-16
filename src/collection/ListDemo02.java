package collection;

import java.util.ArrayList;

/**
 * List提供了一堆重载的add,remove方法。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 15:36
 */
public class ListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        /*
        * add(int index, E e): void
        * 将给定元素插入到指定位置。
        * */
        System.out.println("------add(int index, E e)------");
        list.add(2, "2");
        System.out.println(list);

        System.out.println("------remove(int index)------");
        String remove = list.remove(1);
        System.out.println(list + "\n" + remove);
    }
}
