package mystring;
/**
 * 字符串拼接的性能问题
 * @author adminitartor
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "a";
		for(int i=0;i<10000000;i++){
			str += "a";
		}
	
		System.out.println("拼接完毕!");
	}
	
}







