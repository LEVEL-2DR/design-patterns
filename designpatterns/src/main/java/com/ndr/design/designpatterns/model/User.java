package com.ndr.design.designpatterns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author dinakar on 08/08/21
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private List<String> permissions;
    private String mailId;
}
