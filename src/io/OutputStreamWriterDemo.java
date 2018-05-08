package io;

import java.io.*;

/**
 * java 按照流读写的最小单位分为字节流和字符流
 *
 * 字符流：以字符为单位读写数据，只能用于文本文件。
 *
 * java.io.Reader java.io.Writer
 * Reader:所有字符输入流的超类
 * Writer:所有字符输出流的超类
 *
 * 转换流：java.io.InputStreamReader/OutputStreamWriter
 * 他们是一对高级流，同时也是常用的字符流实现类。在读写文件是，使用高级流进行流连接中非常重要的一环，起到承上启下的作用。
 * 因为几乎所有的字符流都只能连接到其他字符流上，而基本上低级流都是字节流，而本身又是字符流，所以起到将字符流和字节流
 * "对接"的作用。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 9:17
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./ft/osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        osw.write("摩擦摩擦，涨幅达萨科技发老实交代");
        osw.write("在光滑的路上的大师傅");
        System.out.println("写出完毕");
        osw.close();
    }
}
