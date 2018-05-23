package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 10:25
 */
public class MapGetDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("u1", "Tom");
        map.put("u2", "Jerry");
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10000000; i++){
            hashMap.put(i, i * 10);
        }
        Long time = System.nanoTime();
        System.out.println(hashMap.get(4999999));
        System.out.println((System.nanoTime() - time));
    }
}
