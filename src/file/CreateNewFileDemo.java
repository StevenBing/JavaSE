package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 *
 * @author StevenBing
 * Created in 2018/5/2 10:47
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        /*
         * boolean exists()
         * 判断当前文件或目录是否已经存在
         */
        if (!file.exists()){
            System.out.println("文件不存在！");
            file.createNewFile();
        }
        System.out.println(file.exists());
    }
}
