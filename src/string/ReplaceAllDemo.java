package string;
/**
 * 字符串支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的
 * 字符串。
 * @author adminitartor
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * 将数字部分替换为#NUMBER#
		 * abc123def456ghi
		 * 替换后
		 * abc#NUMBER#def#NUMBER#ghi
		 * 
		 * 将字母部分替换为#CHAR#
		 * #CHAR#123#CHAR#456#CHAR#
		 */
		str = str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}






