package com.wj.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String add(){
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://localhost:8081/stock/reduce", String.class);
        return "hello world" + msg;
    }
}
