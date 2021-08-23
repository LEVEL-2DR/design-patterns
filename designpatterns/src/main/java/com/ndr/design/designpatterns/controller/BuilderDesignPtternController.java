package com.ndr.design.designpatterns.controller;

import com.ndr.design.designpatterns.model.BuilderModel;
import com.ndr.design.designpatterns.service.BuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinakar on 04/08/21
 */
@RestController
@RequestMapping("builder-design-pattern")
public class BuilderDesignPtternController {

    @Autowired
    private BuilderService builderService;

    @GetMapping("builder")
    public String builderDesignPattern(BuilderModel.BuilderModelBuilder modelBuilder) {
        return builderService.builderPatternTest(modelBuilder);
    }

    @GetMapping("builder-no-body")
    public String builderDesignPatternNoBody() {
        return builderService.builderPattern();
    }

}
