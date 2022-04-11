package com.wj.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @RequestMapping(value = "/reduce")
    public String reduce(){
        System.out.println("削减库存");
        return "削减库存";
    }

}
