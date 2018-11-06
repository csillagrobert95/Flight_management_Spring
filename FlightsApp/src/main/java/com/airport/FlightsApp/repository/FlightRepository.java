package com.airport.FlightsApp.repository;

import com.airport.FlightsApp.persistance.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Robi on 10/31/2018.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
}
