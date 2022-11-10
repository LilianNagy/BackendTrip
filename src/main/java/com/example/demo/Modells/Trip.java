package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class Trip {
    public Trip(long tripid, String startTime, String endTime, String toStation, String fromStation) {
        Tripid = tripid;
        StartTime = startTime;
        EndTime = endTime;
        ToStation = toStation;
        FromStation = fromStation;
    }

    public Trip(String startTime, String endTime, String toStation, String fromStation) {
        StartTime = startTime;
        EndTime = endTime;
        ToStation = toStation;
        FromStation = fromStation;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "Tripid=" + Tripid +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", ToStation='" + ToStation + '\'' +
                ", FromStation='" + FromStation + '\'' +
                '}';
    }

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

    public Trip() {

    }
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
