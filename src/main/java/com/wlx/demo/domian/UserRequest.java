package com.wlx.demo.domian;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * Created by zhangpan on 2018/7/17.
 */

@Data
@ApiModel(value = "UserRequest",description = "用戶的請求參數")
public class UserRequest {
    @ApiModelProperty("用户名")
    private String username;
    private String password;
    private String adress;

}
