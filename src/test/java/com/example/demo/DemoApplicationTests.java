package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> userList= userMapper.selectList (null);
        userList.forEach (user -> System.out.println ("user = " + user));
    }

}
