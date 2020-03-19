package com.example.demo.Controller;

import com.example.demo.Checkout.Phone;
import com.example.demo.Checkout.add;
import com.example.demo.Mapper.dao.CheckOut;
import com.example.demo.until.JsonResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Author:linjunbo
 * @Description: 参数校验控制层
 * @Date: 2020/3/18 14:31
 */
@RestController
@RequestMapping("/checkOut")
@Validated
public class CheckOutController {
    @PostMapping("/login")
    public JsonResult login(@Validated @RequestBody CheckOut user){
        return JsonResult.success("登陆成功");
    }

    @GetMapping("/getLogin")
    public JsonResult getLogin(@Validated(add.class) CheckOut user){
        return JsonResult.success("登陆成功");
    }

    @GetMapping("/getUser")
    public JsonResult getUser(@NotEmpty(message = "用户名不能为空") String username){
        CheckOut user = new CheckOut();
        user.setUsername(username);
        user.setPassword("123456");
        return JsonResult.success(user);
    }

    @GetMapping("/exception")
    public JsonResult exception(@NotEmpty(message = "用户名不能为空") String username){
        throw new RuntimeException();
    }
   //自定义参数校验测试
    @GetMapping("/sendPhone")
    public JsonResult sendPhone(@Phone @NotNull(message = "手机号不能为空") String phone){
        return JsonResult.success("正确的手机号");
    }
}
