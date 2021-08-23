package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.service.ProxyTester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dinakar on 31/07/21
 */
@Service
public class ProxyTesterImpl implements ProxyTester {
    @Autowired
    ActualProxyImpl actualProxyImpl;

    @Override
    public String isUserAllowed(String userName) {
        if (userName.equalsIgnoreCase("DINAKAR")) {
            return actualProxyImpl.isUserAllowed(userName);
        } else {
            return "ACTUAL OBJECT NOT CALLED";
        }
    }
}
