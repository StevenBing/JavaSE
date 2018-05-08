package io;

import java.io.*;
import java.util.Scanner;

/**
 * 使用PrintWriter 用流连接形式创建。 完成记事本功能。 将控制台输入的每一行字符串写入文件./ft/note.txt中
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 11:02
 */
public class PrintWriterDemo3 {
	public static void main(String[] args) throws IOException {
	    /*
	    * PrintWriter(BufferedWriter bw,boolean autoFlush)
	    * PrintWriter(String fileName, String charsetName)
	    * 调用print方法是不会自动行刷新的
	    * */
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("./ft/note.txt", true), "utf-8")),true);
		Scanner scanner = new Scanner(System.in);
		String str;
		while (true) {
			str = scanner.nextLine();
			if ("exit".equals(str)) {
				break;
			}
			pw.println(str);
		}
		pw.close();
	}
}