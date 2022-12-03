package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class Station{

    @Id
    @SequenceGenerator(
            name = "station_seq",
            sequenceName = "station_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "station_seq"
    )
    private Long id;
    @Column
    private String name;

    public Station(Long id, String name) {
        this.id=id;
        this.name=name;
    }

    public Station() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
