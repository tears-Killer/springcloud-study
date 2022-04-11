package com.wj.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @Value(value = "${server.port}")
    private String port;

    @RequestMapping(value = "/reduce")
    public String reduce(){
        System.out.println("削减库存");
        return "削减库存" + port;
    }

}
