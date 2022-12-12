package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zz
 * @create 2022-12-07 21:20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
