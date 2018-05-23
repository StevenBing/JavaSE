package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 17:44
 */
public class MapEntrySetDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Host", "doc.tedu.cn");
        map.put("Connection", "keep-alive");
        map.put("Cache-Control", "max-age=0");

        /*
        * map没有提供之间遍历的方法！可以利用entrySet 和 keySet间接实现遍历
        * Entry对象就代表map中的key-value对
        * Entry中包含两个属性，一个是key一个是value,Entry的实现类是HashMap的内部类。
        * */
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }
}
