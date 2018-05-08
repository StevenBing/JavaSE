package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedReader/BufferedWriter
 * 内部有缓冲区，可以块读写字符，并且按行读写字符串
 *
 * java.io.PrintWriter
 * 具有行刷新的缓冲字符输出流，内部会连接到BufferedWriter作为缓冲操作。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 10:22
 */
public class PrintWriterDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
       /*
        * PrintWriter提供了字节对文件操作的构造器
        * PrintWriter(String path)
        * PrintWriter(File file)
        */
        PrintWriter pw = new PrintWriter("./ft/pw.txt");
        pw.println("空间来看经济法律看到健身房啦");
        pw.println("jfdaslkjf;lsadkjf");
        System.out.println("写出完毕");

        pw.close();
    }
}
