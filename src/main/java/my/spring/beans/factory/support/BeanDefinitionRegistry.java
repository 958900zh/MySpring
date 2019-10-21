package my.spring.beans.factory.support;

import my.spring.beans.BeanDefinition;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public interface BeanDefinitionRegistry {

    BeanDefinition getBeanDefinition(String beanId);

    void registerBeanDefinition(String beanId, BeanDefinition bd);
}
