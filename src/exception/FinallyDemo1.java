package exception;

/**
 * finally块是异常捕获机制的最后一块
 * 不管try中是否抛出异常都必须执行
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 15:55
 */
public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "";
            System.out.println(str.length());
            return;
        }catch (Exception e){
            System.out.println("程序出错了");
        }finally{
            System.out.println("finally中的代码运行了");
        }

        System.out.println("程序结束了");
    }
}
