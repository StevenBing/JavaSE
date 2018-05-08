package string;
/**
 * 和谐用语
 * @author adminitartor
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|cnm|mmp|sb|nc|mdzz|djb)";
		
		String message = "mmp!cnm!你这个sb!你怎么这么nc!mdzz!你个djb!";
		
		message = message.replaceAll(regex, "***");
		
		System.out.println(message);
		
		
		
	}
}
