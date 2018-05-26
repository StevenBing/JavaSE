package lambda;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 17:37
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        list.sort(comparator);
        System.out.println(list);

        /*
        * 编译器会结合上下文分析参数类型，若不能确定时编译器会要求指定参数类型。若可以省略{}时，方法若有返回值，那么return
        * 关键字也需要一同省略。
        * */
        Comparator<String> comparator1 = (o1, o2) -> o2.length() - o1.length();
        list.sort(comparator1);
        System.out.println("sort by lambda :  " + list);
    }

}
