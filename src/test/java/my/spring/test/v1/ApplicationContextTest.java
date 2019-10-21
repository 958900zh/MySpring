package my.spring.test.v1;

import my.spring.config.TestConfig;
import my.spring.context.ApplicationContext;
import my.spring.context.support.ConfigApplicationContext;
import my.spring.service.v1.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-21
 **/

public class ApplicationContextTest {

    @Test
    public void testGetBean() {
        ApplicationContext context = new ConfigApplicationContext(TestConfig.class);

        PetStoreService petStore = (PetStoreService) context.getBean("petStore");

        Assert.assertNotNull(petStore);
    }
}
