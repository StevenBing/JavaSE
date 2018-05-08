package mystring;

/**
 * @author StevenBing
 *         <p>
 *         Date Created in 2018/4/28 10:24
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "567abc123def456ghi";
		/*
		   *
		   * 按照数字部分进行拆分
		   * abc def ghi
		 */
		String[] array = str.split("\\d+");
		String[] arr = str.split("\\d");
		System.out.println("len:" + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("arrlen:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
