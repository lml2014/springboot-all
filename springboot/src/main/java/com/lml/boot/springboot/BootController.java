package com.lml.boot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("/getIndex")
    public Object getIndex() {
        return "this is spring boot application.";
    }
}
