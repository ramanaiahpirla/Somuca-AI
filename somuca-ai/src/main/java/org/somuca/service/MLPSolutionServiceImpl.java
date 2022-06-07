package org.somuca.service;

import java.util.List;

import org.somuca.domain.MLPSolution;
import org.somuca.repository.MLPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MLPSolutionServiceImpl implements MLPSolutionService{
	
	@Autowired
	private MLPRepository mlpRepo;
		

	@Override
	public MLPSolution createMLPSolution(MLPSolution mlp) {
		return mlpRepo.save(mlp);
	}

	@Override
	public List<MLPSolution> fetchMLPSolutionList() {
		
		return mlpRepo.findAll();
	}
	

}
