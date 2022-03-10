package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.dnd.domain.Country;
import edu.miu.dnd.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryRepository repository;
	
	@Override
	public List<Country> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Country> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void saveCountry(Country country) {
		repository.save(country);
	}

}
