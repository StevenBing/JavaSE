package reflect;

/**
 * java反射机制
 * 反射机制允许我们对一个类的加载，实例化，调用方法操作属性从编码期改为在运行期进行。大大提升了代码的灵活度。
 * 但是运行期进行反射操作会消耗额外的资源与性能。所以我们要适度使用。
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/23 0023 11:36
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*
        * JVM加载一个类有以下几种方式:
        * 1:执行代码时，发现需要用到某个类时。
        *
        * 2:通过反射机制中的Class.forName(String className)方法以字符串形式告知JVM加载指定的类
        * 此方法只能寻找环境变量中配置的类路径中指定的类。
        *
        * 3:通过类加载器ClassLoader来加载指定的类。类加载器可以额外指定环境变量中没有指定的类路径，并
        * 从中寻找指定的类进行加载。
        *
        * 除了第一种方式外，剩下的两种都是通过反射机制动态加载一个类。
        * */

        Person person = null;
        /*
        * 加载类的过程就是让JVM读取该类对应的class文件
        *
        * 当JVM读取一个类的class文件后，会实例化一个Class类的实例用于保存加载的这个类的信息。
        * 并且每个被加载的类只会进行一次加载过程，这意味着每个被JVM加载的类都会在JVM内部以一个Class
        * 类的实例进行保存。所以每个类有且只有一个Class类的实例与之对应。
        * Class称为为类对象。每个实例用于表示JVM加载的一个类，通过它可以获取其表示的类的相关信息。比
        * 如:类名，有哪些属性，构造器，以及所有方法。并且通过Class还可以实例化其表示的类。
        * */
        Class cla = Class.forName("reflect.Person");
        Object o = cla.newInstance();
        if (o instanceof Person) {
            Person person1 = (Person) o;
            person1.sayHello();
            person1.sayHi();
        }

    }
}
