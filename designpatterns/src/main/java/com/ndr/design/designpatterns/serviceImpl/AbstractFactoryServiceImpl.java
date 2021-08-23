package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.service.AbstractFactory;
import com.ndr.design.designpatterns.service.FactoryService;
import org.springframework.stereotype.Service;

/**
 * @author dinakar on 02/08/21
 */
@Service
public class AbstractFactoryServiceImpl extends AbstractFactory {
    @Override
    public FactoryService getFactoryService(String factoryName) {
        if("service1Factory".equals(factoryName))
            return new FactoryService1Impl();
        else
            return new FactoryService2Impl();
    }
}
