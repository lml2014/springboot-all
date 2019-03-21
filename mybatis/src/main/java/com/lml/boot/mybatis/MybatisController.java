package com.lml.boot.mybatis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @RequestMapping("/index")
    public Object index() {
        return "index";
    }
}
