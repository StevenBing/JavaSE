package io;

import java.io.*;

/**
 * 缓冲字节输入流，可以按行读取字符串
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 14:05
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./src/io/BufferedReaderDemo.java")));
        /*
        * BufferedReader提供了直接读取一行字符串的方法：readLine():String
        * 该方法会连续读若干个字符，当读取到"\n"时返回一个字符串，若返回为NULL时表示到了文件末尾。
        * */
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
