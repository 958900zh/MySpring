package my.spring.config;

import my.spring.service.v1.PetStoreService;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-20
 **/

public class TestConfig {

    public PetStoreService petStore() {
        return new PetStoreService();
    }
}
