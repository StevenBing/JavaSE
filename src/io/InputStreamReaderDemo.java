package io;

import java.io.*;

/**
 * 可以读取字符
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 9:42
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./ft/osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] data = new char[20];
        int len = -1;
        while ((len = isr.read(data)) != -1){
            System.out.println(new String(data,0,len));
        }
//        System.out.println((char)isr.read());
        isr.close();
    }
}
