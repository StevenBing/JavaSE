package io;

import java.io.*;

/**
 * 缓冲输出流写数据时的缓冲区问题
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/4 15:33
 */
public class BufferedOutputStream_Flush {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("Yijdalksjfoiasd否按实际得分绝对是dsajflkdsajflksa".getBytes("utf-8"));
        //强制将缓冲区内容写出，适合需要时效性要求的写出
        bos.flush();
        //内部调用了flush()方法，但是没有时效性
        bos.close();
    }
}
