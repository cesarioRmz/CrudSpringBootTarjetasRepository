package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;

import jakarta.transaction.Transactional;

@Repository
public interface TarjetasRepository extends JpaRepository<Tarjetas,Integer>{

	@Query(value = "SELECT * FROM AATARJETAS",nativeQuery = true)
	List<Tarjetas> getAllTarjetas();

	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO AATARJETAS (ID, TIPO_TARJETA, BANCO, TITULAR, NUMTARJETA, FECHA_VENCIMIENTO, CVV, SALDO)"
			+ "				  values (?1, ?2, ?3, ?4, ?5, ?6, ?7,?8)", 
			nativeQuery = true)
	
	void guardarTarjetas(int id, String tipo_tarjeta, String banco, String titular, String numTarjeta,
			Date fechaVencimiento, int cvv, double saldo);
	
	
}
