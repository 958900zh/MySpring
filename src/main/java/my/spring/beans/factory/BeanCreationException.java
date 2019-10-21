package my.spring.beans.factory;

import my.spring.beans.BeansException;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class BeanCreationException extends BeansException {

    public BeanCreationException(String message) {
        super(message);
    }

    public BeanCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
