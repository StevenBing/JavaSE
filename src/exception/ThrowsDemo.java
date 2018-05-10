package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 派生类在继承超类时重写其方法，那么在重写超类方法含有throws声明异常抛出时，对throws的重写规则：
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 9:07
 */
public class ThrowsDemo {
    public void dosome() throws IOException, AWTException {

    }
}

class Son extends ThrowsDemo {
//    抛出超类相同的异常
//    public void dosome() throws IOException, AWTException {}

//    不抛异常
//    public void dosome(){}

//    抛出超类的部分异常
//    public void dosome() throws IOException {}

//  抛出超类异常的派生类异常
    public void dosome()throws FileNotFoundException{}
}