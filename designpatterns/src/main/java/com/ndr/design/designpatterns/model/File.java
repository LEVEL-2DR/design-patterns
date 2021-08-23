package com.ndr.design.designpatterns.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author dinakar on 08/08/21
 */
@Setter
@Getter
@AllArgsConstructor
public class File {
    private String fileName;
    private String  fileType;
}
