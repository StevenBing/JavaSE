package exception;

/**
 * 自定义异常(年龄不合法)
 *
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/9 9:53
 */
public class IllegalAgeException extends Exception{

    private static final long serialVersionUID = 2834936413273099020L;

    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
