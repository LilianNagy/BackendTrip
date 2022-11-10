package com.example.demo.Component;

import com.example.demo.Controller.Admin;
import com.example.demo.DataInterface.AdminDataAccess;
import com.example.demo.Modells.AdminModel;
import com.example.demo.Modells.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdminComponent {
    private final AdminDataAccess data;

    @Autowired
    public AdminComponent(AdminDataAccess data) {
        this.data = data;
    }


    public void Login(AdminModel adminModel) {
        //if
        //adminModell.getUsername()== data.findBy((<adminModell.getUsername())

    }

    public void Register(AdminModel adminModel) {
        //data.save(adminModel);

    }


}
