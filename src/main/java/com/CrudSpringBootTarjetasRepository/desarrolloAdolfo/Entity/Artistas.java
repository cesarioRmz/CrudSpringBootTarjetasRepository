package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "AAARTISTAS")
public class Artistas {
	@Id
	private int id;
	private String nombre;
	private String apellidos;
	private String genero;
	private String cancion_famosa;
	private String album;
	private int edad;
	private int anio_retiro;
	
	
	

}
/*
 CREATE TABLE AAARTISTAS(
	ID NUMBER PRIMARY KEY,
	NOMBRE NVARCHAR2(50),
	APELLIDOS NVARCHAR2(50),
	GENERO NVARCHAR2(50),
	CANCION_FAMOSA NVARCHAR2(50),
	ALBUM NVARCHAR2(50),
	EDAD NUMBER,
	ANIO_RETIRO NUMBER
);

 */
 