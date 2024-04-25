package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.models.Vehicle;
import com.example.demo.repositories.VehicleRepository;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class IndexController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping("/")
    public String start(){
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String index(Model model) {
        List<Vehicle> vehicles =  vehicleRepository.findAll();
        model.addAttribute("vehicles", vehicles);
        return "index";
    }
    @PostMapping("/new-vehicle")
    public String newVehicle(@ModelAttribute Vehicle vehicle, Model model){
        vehicleRepository.save(vehicle);
        return "redirect:/home";
    }
    
}
