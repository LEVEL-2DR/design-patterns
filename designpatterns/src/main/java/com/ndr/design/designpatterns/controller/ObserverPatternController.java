package com.ndr.design.designpatterns.controller;

import com.ndr.design.designpatterns.serviceImpl.ObserverDesignPatternImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinakar on 08/08/21
 */
@RestController
@RequestMapping("observer-design-pattern")
public class ObserverPatternController {
    @Autowired
    private ObserverDesignPatternImpl observerDesignPattern;

    @GetMapping("notifications")
    public String notificationsSent() {
        return observerDesignPattern.notifications();
    }
}
