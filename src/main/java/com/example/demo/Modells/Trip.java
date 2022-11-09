package com.example.demo.Modells;

import javax.persistence.*;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Tripid;
    @Column
    private String StartTime;
    @Column
    private String EndTime;
    @Column
    private String ToStation;
    @Column
    private String FromStation;


    public long getTripid() {
        return Tripid;
    }

    public void setTripid(long tripid) {
        Tripid = tripid;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getToStation() {
        return ToStation;
    }

    public void setToStation(String toStation) {
        ToStation = toStation;
    }

    public String getFromStation() {
        return FromStation;
    }

    public void setFromStation(String fromStation) {
        FromStation = fromStation;
    }
}
