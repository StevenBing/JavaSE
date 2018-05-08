package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 该类设计用来专门读写文件数据，其基于指针进行读写
 * 即：总是在指针当前位置进行读写字节
 *
 * RAF只有两种常用创建模式：
 * "r":只读模式
 * "rw":读写模式
 * @author StevenBing
 * Created in 2018/5/2 16:07
 */
public class RandomAccessFileDemo {
    /*
     *RAF常用构造方法：
     * RandomAccessFile(String path, String mode)
     * RandomAccessFile(File file, String mode)
     * mode:读写模式，"r" or "rw"
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./raf.dat", "rw");
        raf.write(1);
        System.out.println("写入完毕");
        raf.close();
    }
}
