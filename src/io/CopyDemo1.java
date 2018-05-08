package io;

import java.io.*;

/**
 * 缓冲流：
 * java.io.BufferedInputStream;
 * java.io.BufferedOutputStream;
 * 缓冲字节输入输出流是用来加快读写速率的
 *
 * 使用缓冲流完成复制
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 11:41
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *使用文件输入流读取文件，使用输出流写出到新文件。使用块读写的形式将原文件数据写入到新文件
         */
        FileInputStream fis = new FileInputStream("ideaIU-2018.1.2.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("ideaIU-2018.1.2_cp.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024*10];
        int len = -1;
        long time = System.currentTimeMillis();
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        time -= System.currentTimeMillis();
        System.out.println(time/-1000);
        System.out.println("复制完毕");
        bos.close();
        bis.close();
    }
}
