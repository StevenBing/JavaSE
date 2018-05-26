package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat可以更具给定的日期格式将字符串与Date之间相互转换。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 10:21
 */
public class SimpleDateFormat_format {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年M月d日 E a hh:mm:ss");
        /*
        * 将给定的Date按照指定日期格式转换为字符串
        * */
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
