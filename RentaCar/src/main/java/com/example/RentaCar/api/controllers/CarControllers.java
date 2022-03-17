package com.example.RentaCar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentaCar.business.abstracts.CarService;
import com.example.RentaCar.business.concretes.CarManager;
import com.example.RentaCar.entities.concretes.Car;

@RestController
@RequestMapping("/cars")
public class CarControllers {
	private CarService carService;
	@Autowired 
	public CarControllers(CarService carService) {
		this.carService=carService;
	}
	@PostMapping("/add")
	public void add(Car car) {
		
		this.carService.add(car);
	}

	@PutMapping("/update")
	public void update(Car car) {
	
		this.carService.update(car);
	}

	@GetMapping("/getAll")
	public List<Car> getAll() {
		
		return this.carService.getAll();
	}

	@DeleteMapping("/delete")
	public void delete(int id) {
		this.carService.delete(id);
		
	}
	

}
