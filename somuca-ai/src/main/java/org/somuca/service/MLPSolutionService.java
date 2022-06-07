package org.somuca.service;

import java.util.List;

import org.somuca.domain.MLPSolution;

public interface MLPSolutionService {
	
	MLPSolution createMLPSolution(MLPSolution mlp);
	
	List<MLPSolution> fetchMLPSolutionList();
	

}
