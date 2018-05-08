package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java标准的IO操作 Input, Output 输入输出 按照功能分为读写，按照方向分为输入输出。方向的常考物是我写的程序。
 * 输入流用来读取数据
 * 输出流用来写出数据
 *
 * java.io.InputStream是所有字节输入流的超类，规定了所有输入流应该具备的读取字节数据的方法
 * java.io.OutputStream是所有输出流的超类
 *
 * java 流分为两大类：字节流和处理流
 * 字节流：又称为低级流，是实际连接程序与你一端的"管道"，负责实际搬运数据。读写一定是建立在低级流的基础之上进行的。
 * 处理流：又称为高级流，不是独立存在的(没有意义),高级流一定是连接在其他流上的，是数据"流经"该流时对数据进行加工处理，
 * 简化我们队数据读写时的某些操作。
 *
 * 文件流： 是一种低级流，用于读写文件数据，功能与RandomAccessFile一样。但是底层的读写方式不一样，文件流时顺序读写的
 * 但是RandomAccessFile是根据指针随机读写的。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 10:23
 */
public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException {
	    /*
	     * 流常见的创建方式：
	     * FileOutputStream(String path)
	     * FileOutputStream(File file)
	     * 文件已经存在，会对文件进行完全覆盖写
	     * FileOutputStream(String path, boolean append)
	     * FileOutputStream(File file, boolean append)
	     * append 为 true 时文件末尾追加写
	     */
        FileOutputStream fos = new FileOutputStream("./fos.txt", true);
        fos.write("输出流\n".getBytes("utf-8"));
        System.out.println("输出完毕");
        fos.close();
    }
}
