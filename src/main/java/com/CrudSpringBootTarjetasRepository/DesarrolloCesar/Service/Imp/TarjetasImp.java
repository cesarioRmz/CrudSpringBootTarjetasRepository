package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Service.Imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;
import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Repository.TarjetasRepository;
import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Service.ITarjetas;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))

public class TarjetasImp implements ITarjetas {
	
	@Autowired
	TarjetasRepository TarjetasRepository;
	@Override
	public List<Tarjetas> consultarArtistas() {
		List<Tarjetas> lista = TarjetasRepository.consultarArtistas();
		return lista;
	}

	
	public void guardar(Tarjetas artista) {

		TarjetasRepository.guardarArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
			artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
			artista.getAnio_retiro());
	}
	
		
	@Override
	public void editar(Tarjetas artista) {
		TarjetasRepository.actualizaArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
				artista.getAnio_retiro());
	}

}