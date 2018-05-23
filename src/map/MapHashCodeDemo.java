package map;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/17 0017 17:00
 */
public class MapHashCodeDemo {
    /*
    * 作为key的类，如果不能很好的重写equals 和 hashCode方法会造成HashMap工作故障。
    * */
    public static void main(String[] args) {
        HashMap<Player, String> map = new HashMap<>();
        map.put(new Player(1), "吃鸡");
        map.put(new Player(2), "英雄联盟");
        map.put(new Player(3), "魂斗罗");

        System.out.println(map.get(new Player(1)));
    }

}

class Player {
    int id;
    public Player(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
