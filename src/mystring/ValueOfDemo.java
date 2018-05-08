package mystring;
/**
 * String提供了一组重载的静态方法:valueOf
 * 作用是将java中其他类型转换为字符串。
 * 常见的是将基本类型转换为字符串
 * @author adminitartor
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int d = 100;
		String str = String.valueOf(d);
		System.out.println("str:"+str);
		
		str = d+"";
		System.out.println("str:"+str);
	}
}








