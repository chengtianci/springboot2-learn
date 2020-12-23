package com.chengtc.boot.bean;

/**
 * @name: Pet
 * @description: 功能描述 - Pet --
 * @author: chengtianci
 * @date: 2020/12/23 上午10:04
 */
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
