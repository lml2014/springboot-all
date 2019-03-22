package com.lml.boot.mybatis;

import com.lml.boot.mybatis.user.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MybatisController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public Object index() {
        return "index";
    }

    @RequestMapping("/user/{id}")
    public Object user(@PathVariable(value = "id") Long id) {
        return userService.getUser(id);
    }
}
