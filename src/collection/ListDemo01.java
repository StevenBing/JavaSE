package collection;

import java.util.ArrayList;

/**
 * java.util.List接口
 * List是可重复集合且有序，提供了一组可以通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArrayList:内部用数组实现，查询效率更好。
 * java.util.LinkedList:内部用链表实现，增删效果更好，且首尾增删效果最好。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 15:16
 */
public class ListDemo01 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        /*
        * get(int index):E
        * 获取指定位置的元素。
        * */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------set(int index, E e)------");
        /*
        * set(int index, E e): E
        * 将指定元素设置到指定位置，返回值为原位置对应的元素。set方法实际意义是替换元素操作。
        * */
        Object element = list.set(1, "2");
        System.out.println(list);
        System.out.println(element);
    }
}
