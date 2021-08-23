package com.ndr.design.designpatterns.service;

import com.ndr.design.designpatterns.serviceImpl.FactoryService1Impl;

/**
 * @author dinakar on 02/08/21
 */
public abstract class AbstractFactory {
    public abstract  FactoryService getFactoryService(String serviceName);
}
