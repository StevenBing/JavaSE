package reflect;

import java.util.Scanner;

/**
 * 测试，表换不同的类名，依靠反射机制实例化该类实例
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/23 0023 14:32
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        Class cla = Class.forName(className);
        Object o = cla.newInstance();
        System.out.println(o);
    }
}
