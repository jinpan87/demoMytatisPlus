package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author panjin
 * @since 2019-03-22
 */
public interface IUserService extends IService<User> {
    Integer deleteAll();
    List selectListBySQL();
}
