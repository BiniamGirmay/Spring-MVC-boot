package edu.miu.dnd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.dnd.domain.Country;
import edu.miu.dnd.service.CountryService;

@RestController
public class CountryController {
	
	private CountryService countryService;
	
	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping("/countries")
	public List<Country> findAll(){
		return countryService.findAll();
	}	
	@GetMapping("/countries/{id}")
	public Optional<Country> findById(@PathVariable Long id){
		return countryService.findById(id);
	}
	@PostMapping("/countries")
	public void saveCountry(){
		 countryService.findAll();
	}
}
