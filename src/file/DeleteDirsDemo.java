package file;

import java.io.File;

/**
 * 删除目录 由于delete只能删除一个空目录 那么实际情况中我们需要先清除目录下的所有文件才能删除这个目录
 *
 * @author StevenBing Created in 2018/5/2 14:04
 */
public class DeleteDirsDemo {
	public static void main(String[] args) {

		File file = new File("./a");
		// file.mkdirs();
		DeleteDirsDemo deleteDirsDemo = new DeleteDirsDemo();
		deleteDirsDemo.delete(file);

	}

	public void delete(File file) {
		if (file.isDirectory() && file.listFiles().length != 0) {
			for (File fi : file.listFiles()) {
				delete(fi);
			}
		}
		file.delete();
	}
}
