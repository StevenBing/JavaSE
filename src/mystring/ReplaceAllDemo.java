package mystring;

/**
 * @author StevenBing
 *         <p>
 * Date Created in 2018/4/28 10:59
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 *将数字拆分替换为#NUMBER#
		 */
		String st = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(st);
	}
}
