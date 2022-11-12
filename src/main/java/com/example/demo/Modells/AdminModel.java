package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class AdminModel {

    public AdminModel(Long id, String username, String password , String email)  {
        this.id = id;
        Username = username;
        Password = password;
        Email = email;
    }

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
    private Long id;

    public AdminModel(Long id) {
        this.id = id;
    }

    @Column
    private String Username;

    @Column
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public AdminModel(String username, String password , String email) {
        Username = username;
        Password = password;
        Email=email;
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
