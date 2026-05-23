package com.Demojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demojpa.models.trip;


public interface ITripRepository extends JpaRepository<trip, Integer> {

	List<trip> findByEstatus(String status);
	
	List<trip> findByDestacadoAndEstatusOrderByIdDesc(int destacado, String estatus);
	
	List<trip> findByCostoBetween(double costo1, double costo2);
	
	List<trip> findByEstatusIn(String[] estatus);
}
