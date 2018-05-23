package map;

import java.util.HashMap;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 14:38
 */
public class MapContainsKeyDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("u1", "Tom");
        map.put("u2", "Jerry");
        map.put("u3", "Andy");
        map.put("u4", "Mac");

        System.out.println(map);
        map.put(null, "Wang");
        System.out.println(map);

        System.out.println("Key:u1  " + map.containsKey("u1"));
        System.out.println("Key:null  " + map.containsKey(null));

        System.out.println("value:Tom  " + map.containsValue("Tom"));
    }
}
