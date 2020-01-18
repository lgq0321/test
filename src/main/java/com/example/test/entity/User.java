package com.example.test.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/15 16:35
 */
@Data
public class User {
    private Long id;
    private String username;
    private String address;
}
