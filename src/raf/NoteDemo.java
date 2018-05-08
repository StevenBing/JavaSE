package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 练习 完成一个简易的记事本工具 程序启动后，用户在控制台输入的每一行字符串都写入到文件note.txt中 当用户输入"exit"时，退出程序。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 11:34
 */
public class NoteDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		RandomAccessFile rw = new RandomAccessFile("./note.txt", "rw");
//		while(rw.read()!=-1){}
		rw.seek(rw.length());
		while (!"exit".equals(str)) {
			 rw.write(str.getBytes("utf-8"));

//			rw.write(str.getBytes("gbk"), (int) rw.getFilePointer(),
//					str.getBytes().length);
            rw.write("\n".getBytes("utf-8"));
			str = scanner.nextLine();

		}
		rw.close();
	}
}
