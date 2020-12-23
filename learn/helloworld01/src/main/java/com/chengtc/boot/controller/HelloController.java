package com.chengtc.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: HelloController
 * @description: 功能描述 - HelloController --
 * @author: chengtianci
 * @date: 2020/12/22 下午1:54
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handler(){
        return "hello world ";
    }
}
