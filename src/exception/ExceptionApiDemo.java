package exception;

/**
 * 异常常用方法
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 9:39
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        try {
            String str = "a";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
//          输出错误堆栈信息，有助于定位错误并解决
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
