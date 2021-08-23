package com.ndr.design.designpatterns.service;

import com.ndr.design.designpatterns.model.BuilderModel;
import org.springframework.stereotype.Service;

/**
 * @author dinakar on 04/08/21
 */
@Service
public interface BuilderService {
    public String builderPatternTest(BuilderModel.BuilderModelBuilder modelBuilder);
    public String builderPattern();
}
