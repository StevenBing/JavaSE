package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author StevenBing Created in 2018/5/2 15:28
 */
public class ListFileDemo2 {
	public static void main(String[] args) {
		File file = new File(".");
		File[] files = file.listFiles(pathname -> {
			// return pathname.getName().endsWith(".txt");
			return pathname.isFile();
		});
		System.out.println(files.length);
		for (File fi : files) {
			System.out.println(fi.getName());
		}
	}
}
