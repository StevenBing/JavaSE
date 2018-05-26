package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar提供了一个set方法，可以对指定时间分量设置对应的值。set(int field, int value):void
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 15:20
 */
public class Calendar_set {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        /*
        * 设置时间为2008-8-8 20:08:08
        * */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        calendar.set(Calendar.YEAR, 2008);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        calendar.set(Calendar.MINUTE, 8);
        calendar.set(Calendar.SECOND, 8);
        Date date = calendar.getTime();
        System.out.println(simpleDateFormat.format(date));
        /*
        * 设置为周四
        * 按照西方的标准，一周的第一天为周日
        * */
        calendar.set(Calendar.DAY_OF_WEEK, 5);
        System.out.println(calendar.getTime());
    }
}
