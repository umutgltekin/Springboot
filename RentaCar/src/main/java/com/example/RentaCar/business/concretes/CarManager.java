package com.example.RentaCar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RentaCar.business.abstracts.CarService;
import com.example.RentaCar.dataAccess.abstracts.CarDao;
import com.example.RentaCar.entities.concretes.Car;
@Service
public class CarManager implements CarService {
	private CarDao carDao;
	

	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	@Override
	public void add(Car car) {
		
		this.carDao.save(car);
	}

	@Override
	public void update(Car car) {
	
		this.carDao.save(car);
	}

	@Override
	public List<Car> getAll() {
		
		return this.carDao.findAll();
	}

	@Override
	public void delete(int id) {
		this.carDao.deleteById(id);
		
	}

}
