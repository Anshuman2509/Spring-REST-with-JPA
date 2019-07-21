package com.anshuman.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anshuman.model.Automobile;
import com.anshuman.repository.AutomobileRepository;

@Repository
public class AutomobileDao {
	@Autowired
	private AutomobileRepository automobileRepository;
	
	public void saveAuto(Automobile automobile) {
		automobileRepository.save(automobile);
	}
	
	public List<Automobile> getAllAutos(){
		return automobileRepository.findAll();
	}
	
	public Automobile getAutoById(int autoId) {
		return automobileRepository.findById(autoId).get();// return type is Optional<Automobile>
	}
	
	public void deleteEmp(int autoId) {
		automobileRepository.deleteById(autoId);
	}
	
	public List<String> getAutoByCountry(String country){
		return automobileRepository.getCarsByCountry(country);
	}
	
	public List<String> getAutosByParent(String parent){
		return automobileRepository.getCarsByParent(parent);
	}
	
	public BigInteger getAutomobileCount() {
		return automobileRepository.getCarCount();
	}
}
