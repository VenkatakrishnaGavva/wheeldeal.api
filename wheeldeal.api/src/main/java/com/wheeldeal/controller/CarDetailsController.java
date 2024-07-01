package com.wheeldeal.controller;

import com.wheeldeal.entity.CarDetails;
import com.wheeldeal.service.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars") // Base path for all endpoints in this controller
public class CarDetailsController {

    private final CarDetailsService carDetailsService;

    @Autowired
    public CarDetailsController(CarDetailsService carDetailsService) {
        this.carDetailsService = carDetailsService;
    }

    // Endpoint to fetch all car details
    @GetMapping
    public List<CarDetails> getAllCarDetails() {
        List<CarDetails> result =  carDetailsService.getAllCarDetails();
        return result;
    }


  
}
