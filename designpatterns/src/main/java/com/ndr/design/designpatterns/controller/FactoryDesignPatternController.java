package com.ndr.design.designpatterns.controller;

import com.ndr.design.designpatterns.serviceImpl.FactoryDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinakar on 01/08/21
 */
@RestController
@RequestMapping("factory-design-pattern")
public class FactoryDesignPatternController {
    @Autowired
    private FactoryDesignService factoryDesignService;

    @GetMapping("service1")
    public String factoryService1() {
        return "RESPONSE ::" + factoryDesignService.testService1();
    }

    @GetMapping("service2")
    public String factoryService2() {
        return "RESPONSE ::" + factoryDesignService.testService2();
    }
}
