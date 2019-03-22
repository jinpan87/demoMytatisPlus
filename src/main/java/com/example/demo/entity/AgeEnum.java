package com.example.demo.entity;

import lombok.Data;

/**
 * @author panjin
 * @create 2019-03-22 16:07
 */
public enum AgeEnum {
    ONE ("少年", 15), TWO ("青年", 25);
    private Integer index;
    private String name;

    AgeEnum(String name, Integer index) {
        this.index = index;
        this.name = name;
    }
    // 普通方法
    public static String getName(int index) {
        for (AgeEnum c : AgeEnum.values ()) {
            if (c.getIndex () == index) {
                return c.name;
            }
        }
        return null;
    }


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
