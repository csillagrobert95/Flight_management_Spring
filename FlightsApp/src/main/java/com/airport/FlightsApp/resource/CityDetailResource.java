package com.airport.FlightsApp.resource;

import com.airport.FlightsApp.persistance.City;
import com.airport.FlightsApp.persistance.LocalCity;
import com.airport.FlightsApp.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Robi on 11/1/2018.
 */

@Controller
public class CityDetailResource {

    @Autowired
    private CityRepository cityRepository;

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/client/city_details")
    public ModelMap showFlights(@RequestParam(value = "id",required = false)City city){
        LocalCity cityData = new LocalCity(city);
        cityData.updateLocalTime();
        return new ModelMap("city_data", cityData);
    }
}
