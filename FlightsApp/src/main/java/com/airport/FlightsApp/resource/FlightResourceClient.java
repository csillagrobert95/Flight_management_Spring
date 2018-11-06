package com.airport.FlightsApp.resource;

import com.airport.FlightsApp.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Robi on 10/31/2018.
 */

@Controller
public class FlightResourceClient {

    @Autowired
    private FlightRepository flightRepository;

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/client/flights")
    public ModelMap showFlights(Model model){
        return new ModelMap().addAttribute("flight_data", flightRepository.findAll());
    }
}
