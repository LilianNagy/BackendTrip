package com.example.demo.Controller;

import com.example.demo.Component.AdminComponent;
import com.example.demo.Component.StationComponent;
import com.example.demo.Component.TripComponent;
import com.example.demo.Modells.AdminModel;
import com.example.demo.Modells.Station;
import com.example.demo.Modells.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api")
public class Admin {


    private final StationComponent stationComp;
    private final AdminComponent Admincomp;
    private final TripComponent tripcomp;

    @Autowired
    public Admin(StationComponent stationComp, AdminComponent admincomp, TripComponent tripcomp) {
        this.stationComp = stationComp;
        this.Admincomp = admincomp;
        this.tripcomp = tripcomp;
    }

    ///STATION CRUD FUNCTIONS
    @GetMapping(path = "/getStation")
    public List<Station> GetStation() {


        return stationComp.GetStation();
    }

    @PostMapping(path = "/addStation")
    public void addNewStation(@RequestBody Station station) {
        stationComp.addNewStation(station);

    }

    @DeleteMapping(path = "/deleteStation/{stationId}")
    public void deleteStation(@PathVariable("stationId") Long stationId) {

        stationComp.deleteStation(stationId);
    }

    @PutMapping(path = "/updateStation/{stationId}")
    public void updateStation(
            @PathVariable("stationId") Long stationId,
            @RequestParam(required = false) String name

    ) {
        stationComp.updateStation(stationId, name);
    }
    ///TRIP CRUD FUNCTIONS
    @GetMapping(path = "/getTrip")
    public List<Trip> GetTrip() {
        return tripcomp.GetTrip();
    }

    @PostMapping(path = "/addTrip")
    public void addNewTrip(@RequestBody Trip trip) {
        tripcomp.addNewTrip(trip);

    }

    @DeleteMapping(path = "/deleteTrip/{tripId}")
    public void deleteTrip(@PathVariable("tripId") Long tripId) {

        tripcomp.deleteTrip(tripId);
    }

    @PutMapping(path = "/updateTrip/{tripId}")
    public void updateTrip
    (
            @PathVariable("tripId") Long tripId,
            @RequestParam(required = false) String NewFromStation

    ) {
        tripcomp.updateTrip(tripId,NewFromStation);
    }

    ///ADMIN LOGIN AND REGISTER
    @PostMapping(path = "/login")
    public void loginAdmin(@RequestBody AdminModel adminModel){
        Admincomp.Login(adminModel);


    }

    @PostMapping(path = "/register")
    public void RegisterAdmin(@RequestBody AdminModel adminModel){
        Admincomp.Register(adminModel);

    }




}
