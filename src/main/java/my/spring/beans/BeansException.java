package my.spring.beans;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
