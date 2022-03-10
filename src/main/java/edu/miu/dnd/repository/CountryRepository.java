package edu.miu.dnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.dnd.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
	
}
