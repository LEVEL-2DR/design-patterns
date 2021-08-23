package com.ndr.design.designpatterns.controller;

import com.ndr.design.designpatterns.serviceImpl.AbstractFactoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinakar on 02/08/21
 */
@RestController
@RequestMapping("abstract-factory-design-pattern")
public class AbstractDesignPatternController {
    @Autowired
    private AbstractFactoryServiceImpl factoryService;

    @GetMapping("service")
    public ResponseEntity<String> getFactory(@RequestParam("factoryName") String factoryName) {
        return new ResponseEntity<>("RESPONSE :: "+factoryService.getFactoryService(factoryName).factoryTestMethod(), HttpStatus.OK);
    }
}
