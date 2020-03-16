package com.example.demo.Mapper.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @Author:linjunbo
 * @Description: 角色表
 * @Date: 2020/2/28 10:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;

}
