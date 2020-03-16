package com.example.demo.Controller;


import com.example.demo.Mapper.dao.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/2/26 9:51
 */
@RestController
@RequestMapping("/test")
@Api(tags = "HELLO CONTROLLER 测试功能接口")
public class TestSwagger {


    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "int",paramType = "path",example = "1")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "接口返回成功状态"),
            @ApiResponse(code = 500, message = "接口返回未知错误，请联系开发人员调试")
    })
        @ApiOperation(value = "通过ID获取用户", notes = "通过用户ID获取用户信息")
        @GetMapping("/getUser/{id}")
        public User findById(@ApiParam(value = "用户ID",required = true) @PathVariable int id){
            return  new User(id,"l林俊波");
        }

        @PostMapping("/userByName")
        @ApiOperation(value = "直接返回ID", notes = "通过用户姓名获取用户信息")
        public String findByName(@ApiParam(value = "用户姓名",required = true,example = "hello") @RequestParam String  name){
            return  name;
        }


}
