package edu.miu.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.miu.dnd.domain.Country;
import edu.miu.dnd.service.CountryService;
import edu.miu.dnd.service.CountryServiceImpl;

@SpringBootApplication
public class Exercise15SpringMvcBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Exercise15SpringMvcBootApplication.class, args);
		CountryService countryService = context.getBean(CountryServiceImpl.class);
		
		/********************  TESTING   ***********/
		Country country1 = new Country("US","Iowa");
		Country country2 = new Country("Canada","Toronto");
		countryService.saveCountry(country1);
		countryService.saveCountry(country2);
		
		System.out.println(countryService.findAll());
	}

}
