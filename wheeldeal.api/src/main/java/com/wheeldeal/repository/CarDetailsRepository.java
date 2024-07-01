package com.wheeldeal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wheeldeal.entity.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Long> {
    
}
