package com.example.demo.Mapper.dao;

import com.example.demo.Checkout.Update;
import com.example.demo.Checkout.add;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author:linjunbo
 * @Description:  参数校验测试表
 * @Date: 2020/3/18 14:36
 */
@Data
public class CheckOut implements Serializable {


    @Length(min = 5, max = 10, message = "用户名长度不合法")
    //groups 分组
    @NotNull(message = "用户名不能为空",groups = add.class)
    private String username;

    @Length(min = 6, max = 16, message = "密码长度不合法")

    @NotNull(message = "密码不能为空")
    private String password;
}
