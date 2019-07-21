package com.anshuman.repository;

import java.math.BigInteger;
import java.util.List;

public interface AutomobileRepositoryCustom {
	public abstract List<String> getCarsByCountry(String country);
	public abstract List<String> getCarsByParent(String parent);
	public abstract BigInteger getCarCount();

}
