package com.chengtc.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.chengtc.boot.bean.Car;
import com.chengtc.boot.bean.Pet;
import com.chengtc.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @name: Myconfig
 * @description: 功能描述 - Myconfig --
 * @author: chengtianci
 * @date: 2020/12/23 上午9:59
 */

/**
 * 1. 配置类里面使用@Bean标注在方法上给容器注册组件，默认是单实例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods :代理bean的方法
 *     Full ： @Configuration(proxyBeanMethods = true)
 *     Lite ： @Configuration(proxyBeanMethods = false)
 *     解决组建依赖
 *
 *  4. @Import({User.class, DBHelper.class}) '
 *      给容器中自动创建出这些组件bean实例   默认组件的名字是全类名 com.chengtc.boot.bean.User  ch.qos.logback.core.db.DBHelper
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true) //告诉springboot这还少一个配置类  == 配置文件  ， 配置类本身也是一个组件
//@ConditionalOnBean
@ConditionalOnMissingBean(name = "tomNewName")
/**
 *   1-开启car的属性配置绑定功能。（car类上不需要@Compoment)
 *   2-把car组件自动注测到容器中
 *   3-引用第三方包的时候
 */
@EnableConfigurationProperties(Car.class)
public class Myconfig {

    /**
     * FULL 外部只能获取到单实例对象
     * @return
     */
    @ConditionalOnBean(name = "tomNewName")
    @Bean //给容器中添加组件，以方法名作为组建的id，返回类型就是组件类型，返回的值就是组件在容器中的实例
    public User user01(){
        User zhangsan = new User("zhangsan",18);
        //User  依赖了pet组件
        //false的时候取消了依赖，user有了一个新的pet
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }
    @Bean("tomNewName")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
