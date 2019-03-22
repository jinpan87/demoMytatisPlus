package com.example.demo.entity;

/**
 * @author panjin
 * @create 2019-03-22 16:12
 */
public enum SexEnum {
    FEMALE ("女", 1),
    MALE ("男", 2);

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private SexEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (SexEnum c : SexEnum.values ()) {
            if (c.getIndex () == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}