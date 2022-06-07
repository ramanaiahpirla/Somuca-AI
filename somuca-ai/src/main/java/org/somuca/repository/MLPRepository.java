package org.somuca.repository;

import org.somuca.domain.MLPSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MLPRepository extends JpaRepository<MLPSolution, String>{
	

}
