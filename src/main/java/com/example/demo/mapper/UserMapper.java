package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author panjin
 * @since 2019-03-22
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
    @Select ("select * from user")
    List selectListBySQL();
    @Delete ("delete * from user")
    Integer deleteAll();

}
