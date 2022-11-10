package com.example.demo.Component;

import com.example.demo.DataInterface.StationDataAccess;
import com.example.demo.Modells.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class StationComponent {
private final StationDataAccess data;

@Autowired
    public StationComponent(StationDataAccess data) {
        this.data = data;
    }

    public List<Station> GetStation(){
       return data.findAll();
    }

    public void addNewStation(Station station) {
    System.out.println(station);
    }

    public void deleteStudent(Long stationId) {

        data.deleteById(stationId);
    }

    @Transactional
    public void updateStation(Long stationId, String name) {
        Optional<Station> station = data.findById(stationId);



        }
}
