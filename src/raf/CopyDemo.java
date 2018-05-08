package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author StevenBing
 * Created in 2018/5/2 17:24
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile r = new RandomAccessFile("./1.jpg", "r");
        RandomAccessFile rw = new RandomAccessFile("./2.jpg", "rw");
        int d;
        while((d = r.read())!=-1){
            rw.write(d);
        }
        r.close();
        rw.close();
    }
}
