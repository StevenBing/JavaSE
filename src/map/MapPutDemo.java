package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 9:40
 */
public class MapPutDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String put1 = map.put("u1", "Tom");
        System.out.println(put1);
        String put2 = map.put("u1", "Jerry");
        System.out.println(put2);
    }
}
