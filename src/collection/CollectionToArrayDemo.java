package collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 集合转换为数组
 * Collection提供了方法：toArray,该方法可以将当前集合转换为一个数组。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 16:39
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);

        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
}
