package com.wheeldeal.service;


import com.wheeldeal.entity.CarDetails;
import com.wheeldeal.repository.CarDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarDetailsServiceImpl implements CarDetailsService {

    private final CarDetailsRepository carDetailsRepository;

    @Autowired
    public CarDetailsServiceImpl(CarDetailsRepository carDetailsRepository) {
        this.carDetailsRepository = carDetailsRepository;
    }

    @Override
    public List<CarDetails> getAllCarDetails() {
        List<CarDetails> carDetails = carDetailsRepository.findAll();
        return carDetails;
    }

    @Override
    public Optional<CarDetails> getCarDetailById(Long id) {
        return carDetailsRepository.findById(id);
    }

    // Implement other methods for CRUD operations as needed
}
