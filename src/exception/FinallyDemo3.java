package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JDK1.7之后推出新特性：自动关闭
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 16:50
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("fis.txt");) {
			int d = fis.read();
			System.out.println(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("程序结束了");
	}
}
