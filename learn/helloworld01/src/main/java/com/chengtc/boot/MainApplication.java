package com.chengtc.boot;

import ch.qos.logback.core.db.DBHelper;
import com.chengtc.boot.bean.Pet;
import com.chengtc.boot.bean.User;
import com.chengtc.boot.config.Myconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @name: MainApplication
 * @description: 功能描述 - MainApplication -- springboot应用 -
 * @author: chengtianci
 * @date: 2020/12/22 下午1:51
 */
/**
 * 主程序类
 * @SpringBootApplication :这是一个springboot应用
 */
@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(
//        excludeFilters = {@ComponentScan.Filter(
//                type = FilterType.CUSTOM,
//                classes = {TypeExcludeFilter.class}
//        ), @ComponentScan.Filter(
//                type = FilterType.CUSTOM,
//                classes = {AutoConfigurationExcludeFilter.class}
//        )}
//)
public class MainApplication {
    public static void main(String[] args) {
        //1. 返回的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);
        //2. 查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
        //3. 从容器中获取组件,注册的组件默认是单利
//        Pet tom01 =run.getBean("tomNewName", Pet.class);
//        Pet tom02 =run.getBean("tomNewName", Pet.class);
//        System.out.println("组件：" +(tom01 == tom02) );
//
//        //4. com.chengtc.boot.config.Myconfig$$EnhancerBySpringCGLIB$$62904538@240139e1
//        Myconfig config  =run.getBean(Myconfig.class);
//        System.out.println(config);
//        //   @Configuration(proxyBeanMethods = true) 这个时候代理对象调用方法，springboot会始终检测这个组件是否应届存在容器，有不会新建 ----> 保持组件单例
//        //   @Configuration(proxyBeanMethods = false)这个时候不会始终检查，会新建新的
//        User user = config.user01();
//        User user1 = config.user01();
//        System.out.println("获取组件：" +(user == user1) );
//
//        User user2 = run.getBean("user01",User.class);
//        Pet pet = run.getBean("tomNewName",Pet.class);
//
//        System.out.println("组件依赖：" +(user2.getPet() == pet) );
//
//        //5. 获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("---------");
//        for(String s: beanNamesForType){
//            System.out.println(s);
//        }
//
//        DBHelper bean = run.getBean(DBHelper.class);
//        System.out.println(bean);


    }
}
