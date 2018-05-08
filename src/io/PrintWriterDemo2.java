package io;

import java.io.*;

/**
 * 在流连接中使用PrintWriter
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 10:46
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos = new FileOutputStream("./ft/pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("按时发撒U盾近距离看到撒");
        pw.println("lkfajsdlkjfasdlkfj");
        System.out.println("写出完毕");
        pw.close();
    }
}
