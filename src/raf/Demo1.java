package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册操作
 * 用户信息包括：用户名(String-32Kb)，密码（String-32Kb），昵称(String-32Kb)，年龄(int)
 * 用户信息保持到user.dat
 * 字符串"留白"操作便于修改内容，不会影响到整个文件的格式。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/3 16:09
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        byte[] cheak = new byte[32];
        System.out.println("欢迎注册");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userName = scanner.nextLine();

        RandomAccessFile rw = new RandomAccessFile("./user.dat", "rw");
        for (int i = 0; i < rw.length()/100; i++){
            rw.seek(i*100);
            rw.read(cheak);
            if(userName.equals(new String(cheak, "gbk").trim())){
                System.out.println("你输入的用户名已存在，sb");
                return;
            }
        }
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        System.out.println("请输入昵称");
        String nickName = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("userName: " + userName);
        System.out.println("password: " + password);
        System.out.println("nickName: " + nickName);
        System.out.println("age: " + age);

        rw.seek(rw.length());
        byte[] bytes = userName.getBytes("gbk");
        bytes = Arrays.copyOf(bytes, 32);
        rw.write(bytes);
        bytes = password.getBytes("gbk");
        bytes = Arrays.copyOf(bytes, 32);
        rw.write(bytes);
        bytes = nickName.getBytes("gbk");
        bytes = Arrays.copyOf(bytes, 32);
        rw.write(bytes);
        rw.writeInt(age);

        System.out.println("写入完毕");
        rw.close();
    }
}
