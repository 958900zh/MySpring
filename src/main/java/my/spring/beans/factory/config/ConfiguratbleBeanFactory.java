package my.spring.beans.factory.config;

import my.spring.beans.factory.BeanFactory;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-21
 **/

public interface ConfiguratbleBeanFactory extends BeanFactory {

    ClassLoader getBeanClassLoader();

    void setBeanClassLoader(ClassLoader beanClassLoader);
}
