package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity;

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
public class ArtistasTania {
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
