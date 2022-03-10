package edu.miu.dnd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class State {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;
}
