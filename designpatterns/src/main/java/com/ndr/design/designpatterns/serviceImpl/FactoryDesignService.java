package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author dinakar on 01/08/21
 */
@Component
public class FactoryDesignService {
    @Autowired
    @Qualifier("service1")
    private FactoryService service1;

    @Autowired
    @Qualifier("service2")
    private FactoryService service2;

    public String testService1() {
        return service1.factoryTestMethod();
    }

    public String testService2() {
        return service2.factoryTestMethod();
    }

}
