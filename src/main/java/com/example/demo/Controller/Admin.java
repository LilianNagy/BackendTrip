package com.example.demo.Controller;

import com.example.demo.Component.AdminComponent;
import com.example.demo.Component.StationComponent;
import com.example.demo.Modells.AdminModel;
import com.example.demo.Modells.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path = "api/station")
public class Admin {


    private final StationComponent stationComp;
    private final AdminComponent admincomp;

    @Autowired
    public Admin(StationComponent stationComp, AdminComponent admincomp) {
        this.stationComp = stationComp;
        this.admincomp = admincomp;
    }

    @GetMapping
    public List<Station> GetStation() {
        return stationComp.GetStation();
    }

    @PostMapping
    public void addNewStation(@RequestBody Station station) {
        stationComp.addNewStation(station);

    }

    @PostMapping
    public void loginAdmin(@RequestBody AdminModel adminModel){
        admincomp.Login(adminModel);


    }

    @PostMapping
    public void RegisterAdmin(@RequestBody AdminModel adminModel){
        admincomp.Register(adminModel);

    }

    @DeleteMapping(path = "{stationId}")
    public void deleteStation(@PathVariable("stationId") Long stationId) {
        stationComp.deleteStudent(stationId);
    }

    @PutMapping(path = "{stationId}")
    public void updateStation(
            @PathVariable("stationId") Long stationId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        stationComp.updateStation(stationId, name);
    }


}
