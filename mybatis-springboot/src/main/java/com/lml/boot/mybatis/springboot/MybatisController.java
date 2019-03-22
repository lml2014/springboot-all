package com.lml.boot.mybatis.springboot;

import com.lml.boot.mybatis.springboot.city.CityMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MybatisController {

    @Resource
    CityMapper cityMapper;

    @RequestMapping("/index")
    public Object index() {
        return "index";
    }

    @RequestMapping("/find/{id}")
    public Object findCity(@PathVariable("id") Long id) {
        return cityMapper.findById(id);
    }
}
