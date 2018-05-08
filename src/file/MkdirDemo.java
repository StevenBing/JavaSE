package file;

import java.io.File;

/**
 * 使用File创建一个目录
 * 
 * @author StevenBing
 * Created in 2018/5/2 11:10
 */
public class MkdirDemo {
    public static void main(String[] args) {
        /*
         *在当前目录下创建一个新的目录
         */
        File file = new File("./demo");

        if (!file.exists()){
            file.mkdir();
            System.out.println("目录创建成功");
        }else{
            System.out.println("当前目录已存在");
        }
    }
}
