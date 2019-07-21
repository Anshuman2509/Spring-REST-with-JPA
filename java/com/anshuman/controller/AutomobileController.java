package com.anshuman.controller;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anshuman.dao.AutomobileDao;
import com.anshuman.model.Automobile;

@RestController
@CrossOrigin(origins = {"http://localhost:4201"})
public class AutomobileController {
	@Autowired
	private AutomobileDao automobileDao;
	
	@GetMapping("/autos")
	public List<Automobile> getAll(){
		return automobileDao.getAllAutos();
	}
	
	@GetMapping("/autos/{id}")
	public Automobile getById(@PathVariable("id")int autoId) {
		return automobileDao.getAutoById(autoId);
	}
	
	@PostMapping("/autos")
	public void post(@Valid @RequestBody Automobile automobile) {
		automobileDao.saveAuto(automobile);
	}
	
	@PutMapping("/autos/{id}")
	public ResponseEntity<Object> updateEmp(@PathVariable("id")int autoId,@RequestBody Automobile automobile){
		Automobile existingAutomobile=automobileDao.getAutoById(autoId);
		if(existingAutomobile==null)
			return ResponseEntity.notFound().build();
		existingAutomobile.setAutoName(automobile.getAutoName());
		existingAutomobile.setParent(automobile.getParent());
		existingAutomobile.setColor(automobile.getColor());
		existingAutomobile.setContinent(automobile.getContinent());
		automobileDao.saveAuto(existingAutomobile);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/autos/{id}")
	public ResponseEntity<Object> deleteEmp(int autoId){
		Automobile  automobile=automobileDao.getAutoById(autoId);
		if(automobile==null)
			return ResponseEntity.notFound().build();
		automobileDao.deleteEmp(autoId);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/autos/country/{country}")
	public List<String> getAutosByCountry(@PathVariable("country") String country){
		return automobileDao.getAutoByCountry(country);
	}
	
	@GetMapping("/autos/parent/{parent}")
	public List<String> getAutosByParent(@PathVariable String parent){
		return automobileDao.getAutosByParent(parent);
	}
	
	@GetMapping("/autos/count")
	public BigInteger getTotalAutoCount() {
		return automobileDao.getAutomobileCount();
	}
}
