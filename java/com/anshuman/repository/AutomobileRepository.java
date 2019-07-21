package com.anshuman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshuman.model.Automobile;

public interface AutomobileRepository extends JpaRepository<Automobile,Integer>,AutomobileRepositoryCustom{

}
