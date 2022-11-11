package com.example.demo.DataInterface;

import com.example.demo.Modells.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripDataAcces extends JpaRepository<Trip,Long> {
}
