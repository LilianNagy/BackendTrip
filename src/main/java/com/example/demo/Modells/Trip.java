package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class Trip {


    public Trip(Long tripid, String startTime, String endTime, String toStation, String fromStation) {
        this.Tripid = tripid;
        this.StartTime = startTime;
        this.EndTime = endTime;
        this.ToStation = toStation;
        this.FromStation = fromStation;
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
    @SequenceGenerator(
            name = "Trip_sequence",
            sequenceName = "Trip_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "Trip_sequence"
    )
    private Long Tripid;
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
    public Long getTripid() {
        return Tripid;
    }

    public void setTripid(Long tripid) {
        this.Tripid = tripid;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getToStation() {
        return ToStation;
    }

    public void setToStation(String ToStation) {
        this.ToStation = ToStation;
    }

    public String getFromStation() {
        return FromStation;
    }

    public void setFromStation(String FromStation) {
        this.FromStation=FromStation;
    }

    public Trip(String startTime, String endTime, String toStation, String fromStation) {
        this.StartTime = startTime;
        this.EndTime = endTime;
        this.ToStation = toStation;
       this.FromStation = fromStation;
    }
}
