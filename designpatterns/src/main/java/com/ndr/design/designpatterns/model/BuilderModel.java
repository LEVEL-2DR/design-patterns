package com.ndr.design.designpatterns.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author dinakar on 04/08/21
 */
@Getter
public class BuilderModel {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String fName;
    private String mName;
    private boolean isManager;
    private Date recentHikeDate;

    private String optionalField;

    @Override
    public String toString() {
        return "BuilderModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", isManager=" + isManager +
                ", recentHikeDate=" + recentHikeDate +
                ", optionalField=" +optionalField +
                '}';
    }

    public BuilderModel(BuilderModelBuilder model) {
        this.id = model.id;
        this.name = model.name;
        this.age = model.age;
        this.salary = model.salary;
        this.fName = model.fName;
        this.mName = model.mName;
        this.isManager = model.isManager;
        this.recentHikeDate = model.recentHikeDate;
    }
    @Setter
    public static class BuilderModelBuilder{
        private int id;
        private String name;
        private int age;
        private long salary;
        private String fName;
        private String mName;
        private boolean isManager;
        private Date recentHikeDate;

        private String optionalField;

        public BuilderModelBuilder(int id, String name, int age, long salary, String fName, String mName, boolean isManager, Date recentHikeDate) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.fName = fName;
            this.mName = mName;
            this.isManager = isManager;
            this.recentHikeDate = recentHikeDate;
        }
        public BuilderModel build() {
            return  new BuilderModel(this);
        }
        public BuilderModelBuilder setOptionalField(String optionalField) {
            this.optionalField = optionalField;
            return this;
        }
    }
}
