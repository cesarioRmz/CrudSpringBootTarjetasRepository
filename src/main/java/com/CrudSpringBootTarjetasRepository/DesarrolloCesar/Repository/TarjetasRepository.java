package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;



@Repository
public interface TarjetasRepository extends JpaRepository<Tarjetas,Integer>{
	
	@Query(value = "SELECT * FROM AAARTISTAS",nativeQuery = true)
	List<Tarjetas> consultarArtistas();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO AAARTISTAS (ID, NOMBRE, APELLIDOS,GENERO,CANCION_FAMOSA, ALBUM, EDAD, ANIO_RETIRO)"
				+ " values (?1, ?2, ?3, ?4, ?5, ?6, ?7,?8)", 
				nativeQuery = true)
	void guardarArtistas (int id,String nombre, String apellidos,String genero,
			String cancion_famosa, String album,int edad,int anio_retiro);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE AAARTISTAS SET NOMBRE=?2 ,APELLIDOS=?3 ,GENERO=?4 ,CANCION_FAMOSA=?5"
			+ ", ALBUM=?6, EDAD=?7 ,ANIO_RETIRO=?8 WHERE ID=?1",nativeQuery = true)
	void actualizaArtistas (int id, String nombre,String apellidos, String genero,String cancion_famosa,
			String album,int edad,int anio_retiro);

}