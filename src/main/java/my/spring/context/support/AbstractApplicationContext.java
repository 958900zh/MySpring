package my.spring.context.support;

import my.spring.beans.factory.config.ConfigBeanDefinitionReader;
import my.spring.beans.factory.support.DefaultBeanFactory;
import my.spring.context.ApplicationContext;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-21
 **/

public abstract class AbstractApplicationContext implements ApplicationContext {

    private DefaultBeanFactory factory;
    private ClassLoader classLoader;

    public AbstractApplicationContext(Class configClass) {
        this.factory = new DefaultBeanFactory();
        ConfigBeanDefinitionReader reader = new ConfigBeanDefinitionReader(factory);
        reader.loadBeanDefinition(configClass);
        factory.setBeanClassLoader(getBeanClassLoader());
    }

    @Override
    public Object getBean(String beanId) {
        return factory.getBean(beanId);
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return this.classLoader != null ? this.classLoader : Thread.currentThread().getContextClassLoader();
    }

    @Override
    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.classLoader = beanClassLoader;
    }
}
