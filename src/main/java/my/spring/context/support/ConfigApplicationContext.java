package my.spring.context.support;

/**
 * @program: MySpring
 * @author: zhangxidong
 * @create: 2019-10-21
 **/

public class ConfigApplicationContext extends AbstractApplicationContext {

    public ConfigApplicationContext(Class configClass) {
        super(configClass);
    }
}
