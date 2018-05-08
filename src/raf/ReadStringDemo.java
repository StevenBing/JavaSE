package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 10:59
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile r = new RandomAccessFile("./raf.txt", "r");
        byte[] bytes = new byte[(int) r.length()];
        r.read(bytes);
        String gbk = new String(bytes, "GBK");
        System.out.println(gbk);
        r.close();
    }
}
