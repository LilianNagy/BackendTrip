package com.example.demo.DataInterface;

import com.example.demo.Controller.Admin;
import com.example.demo.Modells.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDataAccess extends JpaRepository<Admin,Long> {


}
