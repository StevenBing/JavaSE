package mystring;

/**
 * @author StevenBing
 *         <p>
 *         Date Created in 2018/4/28 10:47
 */
public class SplitDemo2 {
	public static void main(String[] args) {
		String image = "123.jpg";
		String[] arr = image.split("\\.");
		System.out.println(System.currentTimeMillis() + "." + arr[1]);
	}
}
