package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取一个字节
 * @author StevenBing
 * Created in 2018/5/2 17:03
 */
public class ReadDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./raf.dat", "r");
        /*
         * int read()
         * 读取一个字节并以int形式返回
         * 若返回的是-1，则表示已经读到文件末尾
         */
        int d = raf.read();
        System.out.println(d);
        d = raf.read();
        System.out.println(d);
        raf.close();
    }
}
