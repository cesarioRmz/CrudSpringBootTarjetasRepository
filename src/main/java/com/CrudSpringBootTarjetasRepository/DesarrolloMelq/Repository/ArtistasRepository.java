package com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Entity.Artistas;

import jakarta.transaction.Transactional;
@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, Integer>{
	
	@Query(value = "SELECT * FROM AAARTISTAS", nativeQuery = true)
	List<Artistas> getAllArtistas();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO AAARTISTAS (ID, NOMBRE, APELLIDOS,GENERO,CANCION_FAMOSA, ALBUM, EDAD,ANIO_RETIRO)"
			+ " values (?1, ?2, ?3, ?4, ?5, ?6, ?7,?8)", nativeQuery = true)
	void guardarArtistas (int id,String nombre, String apellidos,String genero, String cancion_famosa, String album,int edad,int anio_retiro);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE AAARTISTAS SET NOMBRE=?2, APELLIDOS=?3, GENERO=?4 ,CANCION_FAMOSA=?5, ALBUM=?6, EDAD=?7,"
			+ "ANIO_RETIRO=?8 WHERE ID=?1", nativeQuery = true)
	void editarArtistas (int id,String nombre, String apellidos,String genero, String cancion_famosa, String album,int edad,int anio_retiro);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM AAARTISTAS WHERE ID=?1", nativeQuery = true)
    void eliminarArtistas (int id);
	
	@Query(value = "SELECT * FROM AAARTISTAS WHERE ID=?1", nativeQuery = true)
    Artistas buscarArtistas (int id);
	
	/*Querys*/
	/*
	@Query(value = "INSERT INTO AAARTISTAS(ID, NOMBRE, APELLIDOS, GENERO, CANCION_FAMOSA, ALBUM, EDAD, ANIO_RETIRO) VALUES "
			+ "(:ID, :NOMBRE, :APELLIDOS, :GENERO, :CANCION_FAMOSA, :ALBUM, :EDAD, :ANIO_RETIRO)", nativeQuery=true)
	void insertarArtista(@Param ("ID") int ID, @Param("NOMBRE") String nombre,  @Param("APELLIDOS") String apellidos, 
			 @Param("GENERO") String genero,  @Param("CANCION_FAMOSA") String cancion_famosa,  @Param("ALBUM") String album,
			 @Param("EDAD") int edad,  @Param("ANIO_RETIRO") int anio_retiro);*/
}
