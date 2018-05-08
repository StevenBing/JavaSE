package string;
/**
 * String substring(int s,int e)
 * 截取当前字符串中指定范围内的子字符串
 * @author adminitartor
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		System.out.println();
		//            0123456789012345
		String str = "thinking in java";
		//截取"ing"
		String sub = str.substring(5,8);
		System.out.println(sub);
		
		//从指定位置开始截取到字符串末尾
		sub = str.substring(9);
		System.out.println(sub);
		
	}
}




