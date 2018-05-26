package date;

import java.util.Date;

/**
 * java.util.Date的每一个实例用于表示一个确切的时间。内部维护一个long值，该值为1970年1月1日 00:00:00到当前Date
 * 所表示的时间之间经过的毫秒数。
 * 由于Date设计时存在时区问题，所以大部分操作时间的方法都被声明为过时的，不再建议使用。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 9:44
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        time += 1000 * 3600 * 24;
        date.setTime(time);
        System.out.println(time);
    }
}
