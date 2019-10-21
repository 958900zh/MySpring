package my.spring.beans.factory.support;

import my.spring.beans.BeanDefinition;
import my.spring.beans.factory.BeanCreationException;
import my.spring.beans.factory.config.ConfiguratbleBeanFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class DefaultBeanFactory implements ConfiguratbleBeanFactory, BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    private ClassLoader classLoader;

    public DefaultBeanFactory() {
    }

    @Override
    public Object getBean(String beanId) {
        BeanDefinition bd = this.beanDefinitionMap.get(beanId);
        if (bd == null) {
            throw new BeanCreationException("Bean Definition [" + beanId + "] does not exist");
        }
        ClassLoader cl = this.classLoader;

        String beanClassName = bd.getBeanClassName();

        try {
            Class<?> aClass = cl.loadClass(beanClassName);
            return aClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new BeanCreationException("create bean for " + beanClassName + " failed", e);
        }
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return this.classLoader != null ? this.classLoader : Thread.currentThread().getContextClassLoader();
    }

    @Override
    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.classLoader = beanClassLoader;
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanId) {
        return this.beanDefinitionMap.get(beanId);
    }

    @Override
    public void registerBeanDefinition(String beanId, BeanDefinition bd) {
        this.beanDefinitionMap.put(beanId, bd);
    }
}
