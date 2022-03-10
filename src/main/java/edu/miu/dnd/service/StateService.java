package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import edu.miu.dnd.domain.State;

public interface StateService {
	public List<State> findAll();
	public Optional<State> findById(Long id);
	public void saveState(State state);
}
