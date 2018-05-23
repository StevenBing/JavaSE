package reflect;

import java.lang.reflect.Method;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/23 0023 16:47
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("reflect.Person");
        Object obj = aClass.newInstance();
        Method dosome = aClass.getDeclaredMethod("dosome");
        //若要调用私有方法，需要设置访问权限
        dosome.setAccessible(true);
        dosome.invoke(obj);
    }
}
