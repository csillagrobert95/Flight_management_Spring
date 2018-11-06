package com.airport.FlightsApp.repository;

import com.airport.FlightsApp.persistance.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Robi on 11/1/2018.
 */
@Repository
public interface CityRepository extends JpaRepository<City, String> {
    Optional<City> findByCityName(String cityName);
}
