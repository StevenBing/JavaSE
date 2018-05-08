package file;

import java.io.File;

/**
 * java.io.File
 *
 * File 的每一个实例可以用于表示文件系统中的一个文件或者目录 使用File可以： 1：访问文件或目录的属性（名字，大小，修改时间等）
 * 2：操作文件或目录（创建或删除） 3：访问一个子目录的子项 但是不能读写文件数据。
 *
 * @author StevenBing Date Created in 2018/5/2 9:40
 */
public class FileDemo {
	public static void main(String[] args) {
		/**
		 * 路径劲量选取相对路径，不同系统的路径方式不同，相对路径可以做到跨平台。
		 * eclipse中的当前目录（./）是当前程序所在项目的目录
		 */
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println("名字： " + name);

        long length = file.length();
        System.out.println("大小： " + length + "KB");

        boolean canRead = file.canRead();
        boolean canWrite = file.canWrite();
        System.out.println("可读： " + canRead + "\n" + "可写： " + canWrite);

        boolean hidden = file.isHidden();
        System.out.println("是否隐藏： " + hidden);


    }
}
