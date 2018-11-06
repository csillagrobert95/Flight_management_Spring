package com.airport.FlightsApp.resource;

import com.airport.FlightsApp.persistance.Flight;
import com.airport.FlightsApp.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

/**
 * Created by Robi on 10/31/2018.
 */

@Controller
public class FlightResourceAdmin {
    @Autowired
    private FlightRepository flightRepository;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin/manageflights")
    public ModelMap showFlights(Model model){
        return new ModelMap().addAttribute("flight_data", flightRepository.findAll());
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("admin/edit_form")
    public ModelMap getEditForm(@RequestParam(value = "id",required = false)Flight flight){
        if(flight == null){
            flight = new Flight();
        }
        return new ModelMap("flight", flight);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("admin/edit_form")
    public String postEditForm(@ModelAttribute @Valid Flight flight, BindingResult errors, SessionStatus status){
        if (errors.hasErrors()){
            return "admin/edit_form";
        }
        flightRepository.save(flight);
        status.setComplete();
        return "redirect:manageflights";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("admin/add_form")
    public ModelMap getAddForm(@RequestParam(value = "id",required = false)Flight flight){
        if(flight == null){
            flight = new Flight();
        }
        return new ModelMap("flight", flight);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("admin/add_form")
    public String postAddForm(@ModelAttribute @Valid Flight flight, BindingResult errors, SessionStatus status){
        if (errors.hasErrors()){
            return "admin/add_form";
        }
        flightRepository.save(flight);
        status.setComplete();
        return "redirect:manageflights";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("admin/delete")
    public String deleteFlight (@RequestParam("id") String id){
        flightRepository.deleteById(id);
        return "redirect:manageflights";
    }
}
