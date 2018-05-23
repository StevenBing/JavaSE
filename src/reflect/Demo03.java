package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/23 0023 15:11
 */
public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        Class cla = Class.forName(className);
        Object obj = cla.newInstance();
        String methodName = scanner.nextLine();
        /*
        * 获取Person类的SayHello()方法
        *
        * Class提供获取其表示的类相关信息的一组方法，其中:getDeclaredMethod(String name,Class<?>... parameterTypes):Method
        * 是获取当前Class所表示的类定义的指定名字及参数列表的方法。
        *
        * Method是发射API中的一个重要的类。
        * 其每一个实例用于表示某个类的一个具体方法。通过Method可以获取到其表示的方法的相关信息，如:方法名，返回值类型，
        * 参数类型，访问修饰符等。并且可以通过Method动态调用其表示的方法。
        * */
        Method method = cla.getDeclaredMethod(methodName, new Class[]{String.class,int.class});
        /*
        * Method的invoke方法是用来调用当前Method所表示的方法。
        * 参数1:由于成员方法属于对象，那么调用Method所表示的方法是要传入该方法所属的对象。
        * 参数2:实际参数，若该方法无参，则传入null即可。
        *
        * 即:若method表示的是Person类的方法sayHello那么method.invoke(o,null);等同于o.sayHello();
        * */
        method.invoke(obj,new Object[]{"小明",55});
    }
}
