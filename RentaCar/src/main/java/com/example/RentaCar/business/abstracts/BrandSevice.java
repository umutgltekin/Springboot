package com.example.RentaCar.business.abstracts;

import java.util.List;

import com.example.RentaCar.entities.concretes.Brand;

public interface BrandSevice {

	void add(Brand brand) throws Exception;

	List<Brand> getAll();

	void update(Brand brand) throws Exception;

	void delete(int id) throws Exception;

}
