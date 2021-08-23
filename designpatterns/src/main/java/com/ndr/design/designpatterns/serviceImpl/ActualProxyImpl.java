package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.service.ProxyTester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dinakar on 31/07/21
 */
@Service
public class ActualProxyImpl implements ProxyTester {

    @Override
    public String isUserAllowed(String userName) {
        return "ACTUAL OBJECT CALLED";
    }
}
