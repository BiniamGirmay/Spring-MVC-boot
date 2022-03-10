package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import edu.miu.dnd.domain.Country;

public interface CountryService {
	public List<Country> findAll();
	public Optional<Country> findById(Long id);
	public void saveCountry(Country country);
}
