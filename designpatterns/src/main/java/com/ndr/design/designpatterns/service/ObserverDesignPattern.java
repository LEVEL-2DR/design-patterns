package com.ndr.design.designpatterns.service;

/**
 * @author dinakar on 08/08/21
 */
public interface ObserverDesignPattern {
    void fileUpload(String fileName, String fileType);

    void deleteFile(String fileName);

    String notifications();

    void generateUsers();
}
