package map;

import java.util.HashMap;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 14:11
 */
public class MapRemoveDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("u1", "Tom");
        map.put("u2", "Jerry");
        map.put("u3", "Andy");
        map.put("u4", "John");
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.remove("u1"));
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());
    }
}
