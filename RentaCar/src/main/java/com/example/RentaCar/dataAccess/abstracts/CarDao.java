package com.example.RentaCar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentaCar.entities.concretes.Car;

@Repository
public interface CarDao extends JpaRepository<Car, Integer>{
	

}
