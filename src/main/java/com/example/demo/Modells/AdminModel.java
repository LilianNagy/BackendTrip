package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class AdminModel {

    @Id
    @SequenceGenerator(
            name = "name",
            sequenceName = "name",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "name"
    )
    @Column
    private String Username;

    public AdminModel(String username, String password) {
        Username = username;
        Password = password;
    }

    @Column
    private  String Password;

    public AdminModel() {

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
