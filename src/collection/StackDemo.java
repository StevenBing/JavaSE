package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈结构可以保存一组元素，存取元素必须遵守先进后出的原则。
 * java.util.Deque支持栈操作，提供了对应的方法。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/16 0016 14:42
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        System.out.println(stack);

        String pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
    }
}
