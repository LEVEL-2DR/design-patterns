package com.ndr.design.designpatterns.controller;

import com.ndr.design.designpatterns.serviceImpl.ActualProxyImpl;
import com.ndr.design.designpatterns.serviceImpl.ProxyTesterImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinakar on 31/07/21
 */
@RestController
@RequestMapping("proxy-desig-pattern")
public class ProxyPatternController {
    @Autowired
    ProxyTesterImpl proxyTesterImpl;

    @GetMapping("role")
    @ApiOperation("Proxy to check User has permission to do operation")
    public ResponseEntity<String> roleBased(@RequestParam("userName") String userName){
       String respone = proxyTesterImpl.isUserAllowed(userName);
        return new ResponseEntity<String>("RESPONSE ::  "+respone, HttpStatus.OK);
    }
}
