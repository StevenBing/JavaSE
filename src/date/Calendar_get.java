package date;

import java.util.Calendar;

/**
 * Calendar提供了一个方法get(int field):int 该方法可以获取指定的时间分量所对应的值。
 * <p>
 * 时间分量是一个int值，不同值表示不同时间分量，无需记忆这些数具体是多少，Calendar提供了对应的常量。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 14:33
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year +"-" + (month+1) + "-" + day);

        /*
        * 根据当前Calendar表示的日期获取指定时间分量的最大值。
        * 今年一共有多少天?
        * */
        int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("今年一共有" + days + "天");
    }

}
