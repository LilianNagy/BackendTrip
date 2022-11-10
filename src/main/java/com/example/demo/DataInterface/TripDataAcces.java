package com.example.demo.DataInterface;

import com.example.demo.Modells.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDataAcces extends JpaRepository<Trip,Long> {
}
