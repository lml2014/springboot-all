package com.lml.boot.mybatis.springboot.city;

import lombok.Data;

@Data
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
