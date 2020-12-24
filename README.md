# Springboot2 learn

## 学习springboot2 记录资料使用的仓库

[B站地址：https://www.bilibili.com/video/BV19K4y1L7MT?p=1](https://www.bilibili.com/video/BV19K4y1L7MT?p=7)

2020年12月24日09:58:31

P10-p15

2020年12月23日10:17:03

p9

p8

p7

- 主要解决理解@Configuration和@Bean （容器中注册组件以及组件的注册规则等）
- springboot2的Lite模式和Full模式 
- lite模式主要解决组件之间的依赖问题，并且lite模式加载速度快于full（因为依赖冲突的先后顺序解决了）
- @Compoment @Controller @Service @Repository

```java
package com.chengtc.boot.config;

import com.chengtc.boot.bean.Pet;
import com.chengtc.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 */
@Configuration(proxyBeanMethods = false) //告诉springboot这还少一个配置类  == 配置文件  ， 配置类本身也是一个组件
public class Myconfig {

    /**
     * 外部只能获取到单实例对象
     * @return
     */
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

```



2020年12月22日10:16:35

学习p1-p6