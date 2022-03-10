package edu.miu.dnd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Country {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String capitalCity;
	
	public Country(String name, String capitalCity) {
		this.name = name;
		this.capitalCity = capitalCity;
	}	
}
