package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicle_details")
public class Vehicle {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "vehicle_registration", nullable = false)
private String vehicleRegistration;

@Column(name = "vehicle_type")
private String vehicleType;

@Column(name = "vehicle_make", nullable = false)
private String vehicleMake;
}
