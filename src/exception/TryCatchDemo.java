package exception;

/**
 * java异常处理机制中的try-catch
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 14:42
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        String str = "poipoioiu90";
        /*
        * 当jvm执行代码是遇到异常，会实例化该异常的一个实例，然后设置好代码执行的过程，并将该异常抛出。
        * 如果抛出异常的代码所在方法没有异常处理能力，异常会抛到方法外，由调用当前方法的代码片段去处理。
        * */

        try {
            System.out.println(str.length());
            /*
            * try代码片段中出错的代码之后的内容都不会被运行。
            * */
            System.out.println("!!!!!!!!!!!!!");
            char ch = str.charAt(44);
        }catch (NullPointerException e){
            System.out.println("出现空指针了!");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
    /*
    * 结果：
    * 程序开始了
    * 出现空指针了!
    * 程序结束了
    * */
}
