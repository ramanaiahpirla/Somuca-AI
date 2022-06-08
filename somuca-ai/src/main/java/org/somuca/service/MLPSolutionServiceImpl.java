package org.somuca.service;

import java.time.Instant;
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
		mlp.setActive(true);
		mlp.setLastDownload(Instant.now());
		mlp.setViewCount(1L);
		mlp.setDownloadCount(1L);
		return mlpRepo.save(mlp);
	}

	@Override
	public List<MLPSolution> fetchMLPSolutionList() {
		
		return mlpRepo.findAll();
	}
	

}
