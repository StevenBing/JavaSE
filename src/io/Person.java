package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类的实例测试对象流读写对象的操作
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 16:00
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -6095846574070797027L;
    private String name;
    private transient int age;
    private String gender;
    private String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
