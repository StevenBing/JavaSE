package map;

import java.util.LinkedList;

/**
 * 测试LinkedList的查找性能。
 * LinkedList采用双向循环链表结构，他的头尾查找性能最好。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 11:39
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("u" + i);
        }

        long time = System.nanoTime();
        System.out.println(linkedList.get(499999));
        System.out.println(System.nanoTime() - time);
    }
}
