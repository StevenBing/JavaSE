package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入自己的生日，然后经过程序计算，输出到今天为止一共活了多少天
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/25 0025 10:49
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        date = dateFormat.parse(time);
        /*
        * 当表达式中含有自变量时，编译其会先将自变量算出存入.class文件中，此时会出现溢出。
        * 如long time = 1L;
        *   time = time + 1000*3600*10000 此时先计算(1000*3600*10000)就会出现int溢出
        * 为了避免这种情况我们应当写作:time = time + 1000L*3600*10000;
        * */
        long days = (System.currentTimeMillis() - date.getTime()) / (1000L * 3600 * 24);
        System.out.println("恭喜你活了" + days + "天了！");
        date.setTime((10000-days)*1000L*24*3600 + System.currentTimeMillis());
        String format = dateFormat.format(date);
        System.out.println("你的10000纪念日是:" + format);
    }
}
