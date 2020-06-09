/*
 * The Hefei JingTong RDC(Research and Development Centre) Group.
 * __________________
 *
 *    Copyright 2015-2020
 *    All Rights Reserved.
 *
 *    NOTICE:  All information contained herein is, and remains
 *    the property of JingTong Company and its suppliers,
 *    if any.
 */

package com.jingTong.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>hello</p>
 *
 * @author zhangruyi
 * @version 1.0
 * @since JDK 1.8
 */

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello world!";
    }
}
