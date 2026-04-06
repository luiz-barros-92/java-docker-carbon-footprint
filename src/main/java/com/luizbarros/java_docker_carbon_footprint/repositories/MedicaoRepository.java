package com.luizbarros.java_docker_carbon_footprint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luizbarros.java_docker_carbon_footprint.entities.Medicao;

@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Long> {
	
}
