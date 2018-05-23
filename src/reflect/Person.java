package reflect;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/23 0023 11:43
 */
public class Person {
    public void sayHello() {
        System.out.println("大家好");
    }
    public void sayHi() {
        System.out.println("Hi!!!!");
    }

    public void sayHello(String name) {
        System.out.println("大家好我是: " + name);
    }

    public void sayHello(String name,int age) {
        System.out.println("大家好我是: " + name + "今年" + age + "岁了！");
    }

    private void dosome() {
        System.out.println("我是私有方法!");
    }
}
