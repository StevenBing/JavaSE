package com.etoak.crawl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转化为集合
 * 数组的工具类：Arrays提供了一个静态方法asList该方法可以将给定的数组转换为一个List集合。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/15 16:55
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four"};
        List<String> asList = Arrays.asList(array);
        System.out.println(asList.size());
        System.out.println(asList);
        /*
        * 对数组转换的集合进行操作，就是对原数组对应操作。
        * */
        asList.set(1, "2");
        System.out.println(array);
        System.out.println(asList);

        /*
        * 增删元素是不支持的操作，因为会导致数组扩容或缩容，那就无法表示原数组了。
        * */
//        asList.add("99");
        /*
        * 自己可以自行创建一个集合，然后做操作。所有集合都支持一个参数为Collection的构造方法，作用是在创建
        * 当前集合的同时包含给定的集合中所有元素。
        * */

        ArrayList<String> list = new ArrayList<>(asList);
        System.out.println(list);
        list.add("five");
        System.out.println(list);
        System.out.println(asList);
        System.out.println(Arrays.toString(array));
    }
}