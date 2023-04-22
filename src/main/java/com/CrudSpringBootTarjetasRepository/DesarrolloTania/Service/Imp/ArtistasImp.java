package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.Imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Repository.ArtistasRepository;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.IArtistas;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))

public class ArtistasImp  implements IArtistas {
	
	@Autowired
	ArtistasRepository artistasRepository;
	@Override
	public List<Artistas> consultarArtistas() {
		List<Artistas> listarArtistas = artistasRepository.consultarArtistas();
		return listarArtistas;
	}

	
	public void guardar(Artistas artista) {

	artistasRepository.guardarArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
			artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
			artista.getAnio_retiro());
	
	}
		
	@Override
	public void editar(Artistas artista) {
		artistasRepository.actualizaArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
				artista.getAnio_retiro());
		
		
	}

	@Override
	public void eliminar(Artistas artista) {
		artistasRepository.eliminaArtista(artista.getId());
		
	}

	@Override
	public Artistas buscarArtistas(Artistas artista) {
		// TODO Auto-generated method stub
		return null;
	}


}
