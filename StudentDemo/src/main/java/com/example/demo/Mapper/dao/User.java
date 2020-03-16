package com.example.demo.Mapper.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/2/26 9:52
 */
@Data
@NoArgsConstructor//无参构造函数
@AllArgsConstructor//有参构造函数
@ApiModel("用户对象")
public class User {
    @ApiModelProperty(required = true,notes = "ID",example = "1")
    private Integer id;
    @ApiModelProperty(required = true,notes = "名字",example = "林俊波")
    private String name;

}
