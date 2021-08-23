package com.ndr.design.designpatterns.service;

import org.springframework.stereotype.Component;

/**
 * @author dinakar on 31/07/21
 */
@Component
public interface ProxyTester {
    String isUserAllowed(String userName);
}
