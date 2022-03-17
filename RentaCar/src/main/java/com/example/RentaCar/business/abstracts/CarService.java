package com.example.RentaCar.business.abstracts;

import java.util.List;

import com.example.RentaCar.entities.concretes.Car;

public interface CarService {
	void add(Car car);
	void update(Car car);
	List<Car> getAll();
	void delete(int id);
	

}
