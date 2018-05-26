package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类，是一个抽象类，规定了操作日期的相关方法。由于不同的日期历法对日期的计算不同，需要靠不同的子类去
 * 实现这些方法。
 * 常用的实现类:java.util.GregorianCalendar,即阳历。
 *
 * Calendar提供了一个静态方法:getInstance()可以获取一个当前系统所在地区适用的实现类，大部分获取的都是阳历实现类。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 14:14
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        /*
        * Calendar提供了一个可以转换为Date的方法。getTime():Date
        *
        * 也提供了一个可以让Calendar表示指定日期的方法:setTime(Date date):void是当前Calendar表示给定Date所表示的日期。
        * */
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
