package exception;

/**
 * 使用当前类测试异常抛出
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/7 17:12
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        /*
        * 当不满足业务逻辑需求时，可以主动抛出异常
        *
        * 当一个方法中使用throw抛出一个异常时就应该在当前方法上使用throws声明该异常的抛出。
        * 当方法被调用时需要处理异常(RuntimeException除外)否则编译不通过。
        * */
        if (age < 0 || age > 1000){
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
