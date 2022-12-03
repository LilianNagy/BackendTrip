package com.example.demo.Component;

import com.example.demo.DataInterface.StationDataAccess;
import com.example.demo.Modells.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
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
    data.save(station);
    System.out.println(station);
        System.out.print("Added new station");
    }

    public void deleteStation(Long stationId) {

        data.deleteById(stationId);

        System.out.println(" deleted station");

    }

    @Transactional
    public void updateStation(Long stationId, String name) {
        Station station = data.findById(stationId)
                .orElseThrow(() -> new IllegalStateException( " does not exist"));
        station.setName(name);
        System.out.print("updated");



        }
}
