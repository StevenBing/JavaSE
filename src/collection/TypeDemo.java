package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * JDK1.5之后推出了一个新特性：泛型
 *
 * 泛型又被称为参数化类型，允许调用者在调用某个类的功能时传入一个或多个类型来定义该类的属性，方法的参数以及返回值类型。
 * 者大大提升了代码的灵活度。
 *
 * 泛型应用最为广泛的地方就是集合，用来指定集合中的元素类型。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 11:01
 */
public class TypeDemo {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
