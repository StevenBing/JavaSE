package mystring;
/**
 * int indexOf(String str)
 * 查看给定字符串在当前字符串中第一次出现的位置，
 * 若当前字符串不含有该内容则返回值为-1
 * @author adminitartor
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
//		              0123456789012345
		String str = "thinking in java";
		int i = str.indexOf("in");
		System.out.println("index:"+i);
		//从指定位置开始查找
		i = str.indexOf("in", 3);
		System.out.println("index:"+i);
		//查找最后一次出现给定字符串的位置
		i = str.lastIndexOf("in");
		System.out.println("index:"+i);
	}
}



