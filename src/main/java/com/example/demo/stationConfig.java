package com.example.demo;

import com.example.demo.DataInterface.StationDataAccess;
import com.example.demo.Modells.Station;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class stationConfig {

    @Bean
    CommandLineRunner commandLineRunner(StationDataAccess repository) {
        return args -> {
            Station giza = new Station(
                    1L,
                    "Giza"

            );
            Station alex = new Station(
                    2L,
                    "alex.j@gmail.com"

            );

            repository.saveAll(
                    List.of(giza, alex)
            );
        };
    }
}
