package exception;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 17:18
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("程序开始了");
        /*
        * 当调用包含有throws声明异常抛出的方法时，编译器必须处理这个异常
        * 可以try-catch
        * 可以继续throws
        * */
        try {
            person.setAge(2000000);
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("程序结束了");
    }
}
