package my.spring.test.v1;

import my.spring.beans.BeanDefinition;
import my.spring.beans.factory.BeanFactory;
import my.spring.beans.factory.config.ConfigBeanDefinitionReader;
import my.spring.beans.factory.support.DefaultBeanFactory;
import my.spring.config.TestConfig;
import my.spring.service.v1.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        DefaultBeanFactory beanFactory = new DefaultBeanFactory();

        ConfigBeanDefinitionReader reader = new ConfigBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinition(TestConfig.class);

        BeanDefinition bd = beanFactory.getBeanDefinition("petStore");

        Assert.assertEquals("my.spring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService storeService = (PetStoreService) beanFactory.getBean("petStore");

        assertNotNull(storeService);
    }

}
