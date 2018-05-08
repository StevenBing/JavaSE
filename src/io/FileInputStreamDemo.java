package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 11:28
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fos.txt");
        byte[] bytes = new byte[200];
        int len = fileInputStream.read(bytes);
        System.out.println(new String(bytes,0,len,"utf-8"));
        fileInputStream.close();
    }
}
