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
@Table(name = "AADIRECCION2")
public class Direccion2 {
	@Id
	private int id;
	private String ciudad;
	private String estado;
	private String nacionalidad;

}

/*
 * ID NUMBER PRIMARY KEY, CIUDAD NVARCHAR2(50), ESTADO NVARCHAR2(50),
 * NACIONALIDAD NVARCHAR2(50) );
 * 
 */