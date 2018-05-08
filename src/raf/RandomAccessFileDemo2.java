package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写基本数据类型已经RAF指针的操作
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 14:37
 */
public class RandomAccessFileDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rw = new RandomAccessFile("./raf.dat", "rw");
        int max = Integer.MAX_VALUE;
        rw.write(max>>>24);
        rw.write(max>>>16);
        rw.write(max>>>8);
        rw.write(max);
        System.out.println(rw.getFilePointer());
        rw.writeInt(max);
        rw.writeLong(Long.MAX_VALUE);
        System.out.println(rw.getFilePointer());
        rw.writeDouble(123.321);
        System.out.println("写入完毕");
        System.out.println(rw.getFilePointer());
        /*
         * void seek(long pos)
         * 移动指针到指定位置
         */
        rw.seek(0);

        System.out.println(rw.readInt());

        rw.close();
    }
}
