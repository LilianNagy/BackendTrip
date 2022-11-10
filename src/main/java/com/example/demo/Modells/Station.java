package com.example.demo.Modells;

import javax.persistence.*;

@Entity
@Table
public class Station{

    @Id
    @SequenceGenerator(
            name = "name",
            sequenceName = "name",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "name"
    )
    private long id;
    @Column
    private String name;

    public Station(long id, String name) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
