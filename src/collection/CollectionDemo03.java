package collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 集合间操作
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 9:06
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("c");
        list.add(".net");
        System.out.println("-------------addAll(Collection<?> c)-------------");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("php");
        set.add("android");
        set.add("java");

        /*
        * addAll(Collection c): boolean
        * 将给定集合中的所有元素添加到当前集合中，只要调用方法的集合发生了改变就返回true。
        * */
        boolean addAll = set.addAll(list);
        System.out.println(set);
        System.out.println(addAll);

        System.out.println("-------------containsAll(Collection<?> c)-------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("c");
        list1.add("php");
        list1.add("c++");
        System.out.println(list1);

        /*
        * containsAll(Collection c):boolean
        * 判断当前集合是否包含给定集合中的所有元素，是返回true。
        * */
        boolean b = list.containsAll(list1);
        System.out.println(b);

        System.out.println("-------------removeAll(Collection<?> c)-------------");
        /*
        * removeAll(Collection<?> c): boolean
        * 删除当前集合中包含给定集合的元素(交集)，当当前集合有改变时返回true。
        * */
        list.remove(list1);
        System.out.println(list);
        System.out.println();
        list.addAll(set);
        System.out.println(list);
        System.out.println(set.add("java"));
    }
}
