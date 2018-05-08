package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读取的数据量，减少读取次数，可以提高读取效率 对于硬盘（磁盘）来说随机读写慢，但是硬盘的块读写效率还是可以保证的 随机读写：1字节读写
 * 块读写：一组字节读写
 * 
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 9:19
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("./DG.exe", "r");
		RandomAccessFile desc = new RandomAccessFile("./DG_cp.exe", "rw");
		byte[] buf = new byte[1024 * 10];
		/*
		 * int read(byte[] data)
		 * 一次性读取给定的字节数组长度的字符量并存入该数组中，返回值是实际读取到的字节量，若返回-1，则是文件末尾
		 * void write(byte[] data)
		 * 一次性将给定的字节数组的所有字节写入文件
		 */
		int len = 0;
		while ((len = src.read(buf)) != -1) {
			desc.write(buf, 0, len);
		}
	}
}
