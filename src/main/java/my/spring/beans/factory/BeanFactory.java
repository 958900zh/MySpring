package my.spring.beans.factory;

import my.spring.beans.BeanDefinition;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public interface BeanFactory {

    Object getBean(String beanId);
}
