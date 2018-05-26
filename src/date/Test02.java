package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期 促销日期计算规则:该商品过期日前两周的周三
 *
 * 程序启动后，要求用户输入商品的生产日期，格式为:yyyy-MM-dd然后输入保质期天数
 *
 * 然后经过计算，输出该商品促销日期，输出格式为:yyyy-MM-dd
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 16:02
 */
public class Test02 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.nextLine();
		int days = scanner.nextInt();
		Date date = format.parse(day);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		calendar.add(Calendar.WEEK_OF_YEAR, -2);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		date = calendar.getTime();
		String result = format.format(date);
		System.out.println(result);
	}
}
