package com.example.RentaCar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RentaCar.entities.concretes.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {
	
	boolean existsByBrandName(String brandName);
	
	boolean existsById(int id);

}
