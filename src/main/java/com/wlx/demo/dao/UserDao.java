package com.wlx.demo.dao;

/**
 * Created by zhangpan on 2018/7/17.
 */

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Map;

@Repository
@Mapper
@Component
public interface UserDao {
    int adduser(Map<String,Object> map) throws SQLException;
}
