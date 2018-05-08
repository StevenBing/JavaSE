package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 11:41
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
         *使用文件输入流读取文件，使用输出流写出到新文件。使用块读写的形式将原文件数据写入到新文件
         */
        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos_copy.txt");
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();
    }
}
