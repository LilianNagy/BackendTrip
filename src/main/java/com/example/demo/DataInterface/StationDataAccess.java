package com.example.demo.DataInterface;

import com.example.demo.Modells.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationDataAccess extends JpaRepository<Station, Long> {

}
