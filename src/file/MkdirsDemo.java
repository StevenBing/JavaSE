package file;

import java.io.File;

/**
 * 用File创建多级目录
 *
 * @author StevenBing
 * Created in 2018/5/2 11:35
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        /*
         *在当前目录下创建./a/b/c/d
         */
        File file = new File("./a/b/c/d");
       /* if (!file.exists()){
            file.mkdirs();
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录创建失败");
        }*/

        if (file.exists()){
            file.delete();
        }
        new File("./demo").delete();
        System.out.println(file.exists());
    }
}
