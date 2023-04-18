package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;

import jakarta.transaction.Transactional;

@Repository
public interface TarjetasRepository extends JpaRepository<Tarjetas,Integer>{

	@Query(value = "SELECT * FROM AATARJETAS",nativeQuery = true)
	List<Tarjetas> getAllTarjetas();
	
	
}
