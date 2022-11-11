package com.example.demo.Component;

import com.example.demo.DataInterface.TripDataAcces;
import com.example.demo.Modells.Station;
import com.example.demo.Modells.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
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

        tripdata.save(trip);
        System.out.println(trip);
        System.out.print("added new trip");
    }
    public void deleteTrip(Long tripId) {

        tripdata.deleteById(tripId);
        System.out.print("deleted");
    }

    @Transactional
    public void updateTrip(Long tripId, String NewFromStation) {
        Trip trip = tripdata.findById(tripId).orElseThrow(() -> new IllegalStateException( " does not exist"));
       trip.setFromStation(NewFromStation);

        System.out.print("updated");

    }
}
