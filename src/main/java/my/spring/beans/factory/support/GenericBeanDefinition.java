package my.spring.beans.factory.support;

import my.spring.beans.BeanDefinition;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String beanClassName;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return beanClassName;
    }
}
