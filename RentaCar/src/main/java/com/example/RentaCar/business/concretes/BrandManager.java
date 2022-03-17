package com.example.RentaCar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentaCar.business.abstracts.BrandSevice;
import com.example.RentaCar.dataAccess.abstracts.BrandDao;
import com.example.RentaCar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandSevice {

	private BrandDao brandDao;

	@Autowired
	public BrandManager(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public void add(Brand brand) throws Exception {

		checkIfBrandExists(brand.getBrandName());

		this.brandDao.save(brand);
		System.out.println("Eklendi");
	}

	private void checkIfBrandExists(String brandName) throws Exception {
		if (this.brandDao.existsByBrandName(brandName)) {
			throw new Exception("Bu marka mevcut");
		}
	}

	@Override
	public List<Brand> getAll() {
		return this.brandDao.findAll();

	}

	@Override
	public void update(Brand brand) throws Exception {
		
		this.brandDao.save(brand);

	}

	private void chekifBrandId(int id) throws Exception {
		if (this.brandDao.existsById(id) == false) {
			throw new Exception("bu id bulunamadı");

		}
	}

	@Override
	public void delete(int id) throws Exception {
		chekifBrandId(id);
		this.brandDao.deleteById(id);

	}

}
