package recursion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出字符串操作
 * 
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 10:18
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * byte[] getBytes(String csn)
		 * 将当前字符串按照制定字符集转换为一组字节。推荐使用这种方式
		 */
		String str = "打了肯德基法律手段";
		byte[] bytes = str.getBytes();
		RandomAccessFile rw = new RandomAccessFile("./a.txt", "rw");
		rw.write(bytes);
		rw.write("kdjasoidjflksadjf".getBytes("GBK"));
		System.out.println("写入完毕");
		rw.close();
	}
}
