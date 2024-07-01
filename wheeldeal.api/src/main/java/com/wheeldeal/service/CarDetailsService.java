package com.wheeldeal.service;



import java.util.List;
import java.util.Optional;

import com.wheeldeal.entity.CarDetails;

public interface CarDetailsService {

    List<CarDetails> getAllCarDetails();

    Optional<CarDetails> getCarDetailById(Long id);

    // Other methods for CRUD operations as needed

}
