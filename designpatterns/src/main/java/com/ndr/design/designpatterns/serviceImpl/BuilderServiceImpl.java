package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.model.BuilderModel;
import com.ndr.design.designpatterns.service.BuilderService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author dinakar on 04/08/21
 */
@Service
public class BuilderServiceImpl implements BuilderService {
    @Override
    public String builderPatternTest(BuilderModel.BuilderModelBuilder modelBuilder) {
        return modelBuilder.setOptionalField("OptionalFieldSet").build().toString();
    }

    @Override
    public String builderPattern() {
        BuilderModel builderModel =
                new BuilderModel.BuilderModelBuilder(1,"DINAKAR",27,1000,"SUBBIAH","SUBBAMMA",false,new Date()).setOptionalField("OptionalSetted").build();
        return builderModel.toString();
    }
}
