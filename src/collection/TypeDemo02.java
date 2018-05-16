package collection;

import java.util.LinkedList;

/**
 * 泛型常见面试题
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 14:05
 */
public class TypeDemo02 {
    public static void main(String[] args) {
        LinkedList<Integer> lis = new LinkedList<>();
        /*
        * 编译器检查add的参数是否是Integer
        * */
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        /*
        * 获取集合元素时，编译器会补全代码将元素造型为Integer
        * */
        for (int i : lis) {
            System.out.println(i);
        }

        /*
        * 不指定泛型时，默认为原型object，所以list集合看待lis集合中的元素是按照object类型看待的。
        * */
        LinkedList list = lis;
        list.add("aaa");
        /*
        * 遍历时会出现造型异常
        * */
        for (int i : lis) {
            System.out.println(i);
        }
    }
}
