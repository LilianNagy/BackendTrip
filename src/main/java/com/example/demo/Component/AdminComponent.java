package com.example.demo.Component;

import com.example.demo.Controller.Admin;
import com.example.demo.DataInterface.AdminDataAccess;
import com.example.demo.Modells.AdminModel;
import com.example.demo.Modells.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminComponent {
    private  AdminDataAccess data;

    @Autowired
    public AdminComponent(AdminDataAccess data) {

        this.data = data;
    }


    public void Login(AdminModel adminModel) {
        data.save(adminModel);

    }

    public void Register(AdminModel adminModel) {
        data.save(adminModel);
      System.out.print("Registered");

    }


}
