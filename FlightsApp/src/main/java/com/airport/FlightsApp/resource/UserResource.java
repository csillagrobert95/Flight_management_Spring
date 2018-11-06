package com.airport.FlightsApp.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robi on 10/23/2018.
 */

@RestController
public class UserResource {

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/client")
    public String showFlights(){
        return "Hello Client";
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String securedAdmin(){
        return "Hello Admin";
    }
}
