package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.miu.dnd.domain.State;
import edu.miu.dnd.repository.StateRepository;

public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public List<State> findAll() {
		return stateRepository.findAll();
	}

	@Override
	public Optional<State> findById(Long id) {
		return stateRepository.findById(id);
	}

	@Override
	public void saveState(State state) {
		stateRepository.save(state);
	}

}
