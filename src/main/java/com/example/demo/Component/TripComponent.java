package com.example.demo.Component;

import com.example.demo.DataInterface.TripDataAcces;
import com.example.demo.Modells.Station;
import com.example.demo.Modells.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TripComponent {
    private final TripDataAcces tripdata;

    @Autowired
    public TripComponent(TripDataAcces tripdata) {
        this.tripdata = tripdata;
    }

    public List<Trip> GetTrip(){
        return tripdata.findAll();
    }

    public void addNewTrip(Trip trip) {
        System.out.println(trip);
    }
}
