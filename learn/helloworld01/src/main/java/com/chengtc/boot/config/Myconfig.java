package com.chengtc.boot.config;

import com.chengtc.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @name: Myconfig
 * @description: 功能描述 - Myconfig --
 * @author: chengtianci
 * @date: 2020/12/23 上午9:59
 */
@Configuration //告诉springboot这还少一个配置类  == 配置文件
public class Myconfig {

    @Bean //给容器中添加组件，以方法名作为组建的id，返回类型就是组件类型，返回的值就是组件在容器中的实例
    public User user01(){
        return new User("zhangsan",18);
    }
}
