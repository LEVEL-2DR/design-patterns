package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.service.FactoryService;
import org.springframework.stereotype.Service;

/**
 * @author dinakar on 01/08/21
 */
@Service("service1")
public class FactoryService1Impl implements FactoryService {
    @Override
    public String factoryTestMethod() {
        return "SERVICE1 CALLED";
    }
}
