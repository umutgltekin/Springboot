package com.example.RentaCar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RentaCar.business.abstracts.BrandSevice;
import com.example.RentaCar.entities.concretes.Brand;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/brands")
public class BrandControllers {
	
	private BrandSevice brandSevice;

	@Autowired
	public BrandControllers(BrandSevice brandSevice) {
		this.brandSevice = brandSevice;
	}
	
	@PostMapping("/add")
	public void add(Brand brand) throws Exception{
		this.brandSevice.add(brand);
	}
	
	
	@GetMapping("/getAll")
	public List<Brand> getAll() {
		return this.brandSevice.getAll();
	}
	
	@PutMapping("/update")
	public void update( Brand brand) throws Exception {
		this.brandSevice.update(brand);
	}
	
	
	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		this.brandSevice.delete(id);
	}

}
