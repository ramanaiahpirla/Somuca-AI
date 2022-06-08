package org.somuca.controller;

import java.util.List;

import org.somuca.domain.MLPSolution;
import org.somuca.service.MLPSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/somuca")

public class SomucaController {

	@Autowired
	private MLPSolutionService mlpSolutionService;

	@PostMapping("/createSolution")
	public ResponseEntity<MLPSolution> createMLPSolution(@ApiParam(value = "MLPSolution Details") @RequestBody MLPSolution mlpSolution) {

		return new ResponseEntity<MLPSolution>(mlpSolutionService.createMLPSolution(mlpSolution), HttpStatus.OK);

	}

	@GetMapping("/listSolutions")
	public ResponseEntity<List<MLPSolution>> getMLPSolutionsList() {
		return new ResponseEntity<List<MLPSolution>>(mlpSolutionService.fetchMLPSolutionList(), HttpStatus.OK);

	}

}
