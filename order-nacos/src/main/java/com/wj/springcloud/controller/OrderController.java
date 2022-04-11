package com.wj.springcloud.controller;

import com.wj.springcloud.feign.ApiStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiStock apiStock;

    @RequestMapping(value = "/add")
    public String add(@RequestHeader(value = "Truth",required = false) String truth){
        System.out.println("下单成功" + truth);
//        String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        String msg = apiStock.reduce();
        return "hello world" + msg;
    }
}
