package com.ndr.design.designpatterns.serviceImpl;

import com.ndr.design.designpatterns.model.File;
import com.ndr.design.designpatterns.model.User;
import com.ndr.design.designpatterns.service.ObserverDesignPattern;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author dinakar on 08/08/21
 */
@Service
public class ObserverDesignPatternImpl implements ObserverDesignPattern {
    private List<User> users = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    @Override
    public void fileUpload(String fileName, String fileType) {
        File file = new File(fileName, fileType);
        files.add(file);
    }

    @Override
    public void deleteFile(String fileName) {
        Boolean flag = false;
        if (files.size() > 0) {
            for (File file : files) {
                if (file.getFileName().equalsIgnoreCase(fileName)) {
                    files.remove(file);
                    flag = true;
                }
            }
        }
        if (flag) {
            notifications();
        }
    }

    @Override
    public String notifications() {
        generateUsers();
        boolean status = false;
        for (User user : users) {
            status = user.getPermissions().stream().allMatch(p_name -> p_name.equalsIgnoreCase("Admin"));
            if (status) {
                System.out.println("Mail sent to User Name ::" + user.getName());
            }
        }
        return "Notifications sent successfully";
    }

    @Override
    public void generateUsers() {
        List<String> list = new ArrayList<>();
        int i = 1;
        while (i < 11) {
            list.clear();
            String permissionName = (i % 2 == 0) ? "Admin" : "SuperAdmin";
            list.add(permissionName);
            User user = new User(UUID.randomUUID().toString(), list, "test@email.com");
            users.add(user);
            i++;
        }
    }
}
