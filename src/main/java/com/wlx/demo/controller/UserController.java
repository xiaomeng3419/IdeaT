package com.wlx.demo.controller;

import com.wlx.demo.domian.UserRequest;
import com.wlx.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangpan on 2018/7/17.
 */

@Api(description = "wlx测试接口", tags = "BusinessApi",
        consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "userInsert", notes = "userInsert")
    @RequestMapping(value = "/userInsert", method = RequestMethod.POST, consumes = "application/json", produces = "application/json;charset=UTF-8")
    public String zpTimerInSert(@RequestBody UserRequest request) throws Exception {
        userService.adduser(request);

        return "success";
    }
}

