package com.wj.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "stock-service")
public interface ApiStock {

    @GetMapping(value = "/stock/reduce")
    String reduce();
}
