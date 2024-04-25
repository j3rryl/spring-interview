package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.repositories.VehicleRepository;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
