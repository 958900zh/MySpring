package my.spring.beans.factory.config;

import my.spring.beans.BeanDefinition;
import my.spring.beans.factory.support.BeanDefinitionRegistry;
import my.spring.beans.factory.support.GenericBeanDefinition;

import java.lang.reflect.Method;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class ConfigBeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    public ConfigBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    public void loadBeanDefinition(Class<?> configClass) {
        Method[] methods = configClass.getDeclaredMethods();

        for (Method method : methods) {
            String beanClassName = method.getReturnType().getName();
            String id = method.getName();

            BeanDefinition bd = new GenericBeanDefinition(id, beanClassName);
            registry.registerBeanDefinition(id, bd);
        }
    }
}
