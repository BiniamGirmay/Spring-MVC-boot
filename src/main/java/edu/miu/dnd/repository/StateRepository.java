package edu.miu.dnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.miu.dnd.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
