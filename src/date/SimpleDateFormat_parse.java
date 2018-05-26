package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串按照对应的格式解析为Date
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 10:39
 */
public class SimpleDateFormat_parse {
    public static void main(String[] args) throws ParseException {
        String str = "2017年12月1日";
        SimpleDateFormat yyyy年12月1日 = new SimpleDateFormat("yyyy年12月1日");
        Date date = new Date();
        date = yyyy年12月1日.parse(str);
        System.out.println(date);
    }
}
