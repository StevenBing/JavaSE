package date;

import java.util.Calendar;

/**
 * Calendar提供了计算时间的方法:add(int field, int amount):void 对给定的时间分量上加上指定的值，若给定的值为负数，则是减去。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 15:44
 */
public class Calendar_add {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        /*
        * 查看3年2个月零25天后是哪天?
        * */
        calendar.add(Calendar.YEAR, 3);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DAY_OF_YEAR, 25);
        calendar.set(Calendar.DAY_OF_WEEK, 4);
        System.out.println(calendar.getTime());
        /*
        * 查看此时的3年前
        * */
        calendar.add(Calendar.YEAR, -3);
        System.out.println(calendar.getTime());
    }
}
