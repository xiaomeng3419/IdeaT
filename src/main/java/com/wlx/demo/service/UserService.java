package com.wlx.demo.service;

import com.wlx.demo.dao.UserDao;
import com.wlx.demo.domian.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangpan on 2018/7/17.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void  adduser(UserRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username",request.getUsername());
        map.put("password",request.getPassword());
        map.put("adress",request.getAdress());
        try {
            userDao.adduser(map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
