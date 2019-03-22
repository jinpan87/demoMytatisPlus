package com.example.demo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author panjin
 * @since 2019-03-22
 */
@Data
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Integer age;
    private Integer sex;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;
    private String remarks;
    private String delFlag;

    public User(String id, String name, Integer age, Integer sexString ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User() {
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
