package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity;



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
public class ResposeUnion {
	
	private Artistas2 art2;
	private Direccion2 dir2;

}
