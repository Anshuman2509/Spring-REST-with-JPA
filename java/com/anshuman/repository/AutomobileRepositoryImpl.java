package com.anshuman.repository;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
@Repository
public class AutomobileRepositoryImpl implements AutomobileRepositoryCustom{
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<String> getCarsByCountry(String country){
		Query query=entityManager.createNativeQuery("select a.auto_name from automobile a where a.country='"+country+"'");
		return query.getResultList();
	}
	
	public List<String> getCarsByParent(String parent){
		Query query=entityManager.createNativeQuery("select a.auto_name from automobile a where a.parent='"+parent+"'");
		return query.getResultList();
	}

	public BigInteger getCarCount() {
		Query query=entityManager.createNativeQuery("select count(a.auto_id) from automobile a");
		return (BigInteger) query.getSingleResult();
	}
	
	
}
