package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流 对象流是一种高级流可以方便我们读写java中的任何对象 对象输出流：可以将指定对象转换为一组字节后写出
 * 该对象必须实现Serializable接口
 * 对象输入流：可以将一组字节还原为对应的对象，前提是这组字节必须一个对象是通过对象输出流转换得到的
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 16:08
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		Person person = new Person("西瓜", 18, "女",
				new String[]{"一个", "数组", "信息"});
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);

        System.out.println("写出完毕");
        oos.close();
    }
}
