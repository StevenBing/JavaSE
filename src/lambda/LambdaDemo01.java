package lambda;

/**
 * JDK1.8之后推出了一个新特性:lambda表达式，使用lambda可以快速简单的创建仅含有一个抽象方法的接口或者抽象类的子类实例。
 * <p>
 * lambda语法:([参数列表]) -> {方法体}
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 17:08
 */
public class LambdaDemo01 {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("lambda");

		new Thread(runnable).start();
	}
}
