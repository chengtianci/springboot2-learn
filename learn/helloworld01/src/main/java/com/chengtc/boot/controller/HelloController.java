package com.chengtc.boot.controller;

import ch.qos.logback.core.db.DBHelper;
import com.chengtc.boot.bean.Car;
import com.chengtc.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: HelloController
 * @description: 功能描述 - HelloController --
 * @author: chengtianci
 * @date: 2020/12/22 下午1:54
 */
@Import({User.class, DBHelper.class})
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){return car;}


    @RequestMapping("/hello")
    public String handler(){
        return "hello world ";
    }
}
