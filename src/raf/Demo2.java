package raf;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 17:21
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[32];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名！");
        String userName = scanner.nextLine();
        RandomAccessFile rw = new RandomAccessFile("./user.dat", "rw");
        for (int i = 0; i < rw.length()/100; i++){
            rw.seek(i*100);
            rw.read(bytes);
            if (userName.equals(new String(bytes, "gbk").trim())) {
                System.out.println("请输入密码！！！");
                String password = scanner.nextLine();
                rw.read(bytes);
                if (password.equals(new String(bytes, "gbk").trim())) {
                    System.out.println("登录成功！！！！");
                    rw.close();
                    return;
                }
                System.out.println("登录失败，你的密码错误");
                rw.close();
                return;
            }
        }
        System.out.println("登录失败，你的用户名错误");
        rw.close();
    }
}
