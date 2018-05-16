package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 15:50
 */
public class ListDemo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        /*
        * subList(int s, int e) : List
        * 获取指定范围内的子集[s,e)区间。
        * */
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);

        /*
        * 将子集中的每个元素扩大10倍。
        * */
        int size = subList.size();
        for (int i = 0; i < size; i++) {
            subList.add(subList.get(i) * 10);
        }
        /*
        * Exception in thread "main" java.util.ConcurrentModificationException
        * */
        /*for (int i : subList) {
            subList.add(i * 10);
        }*/
        /*
        * 对子集进行操作就是对原集合相应元素的操作。
        * */
        System.out.println(subList.subList(size,size*2));

        System.out.println(list);
    }
}
