package cn.springcloud.dubbo.demo.consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Service
public class BarServiceImpl implements BarService {
    @Override
    public String bar() {
        return "Bar " + System.currentTimeMillis();
    }
}
