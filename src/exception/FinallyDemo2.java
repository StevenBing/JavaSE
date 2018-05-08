package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 异常处理机制IO中的使用
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 16:32
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try {
            fis = new FileInputStream("fis.txt");
            int d = fis.read();
            System.out.println(d);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fis != null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
