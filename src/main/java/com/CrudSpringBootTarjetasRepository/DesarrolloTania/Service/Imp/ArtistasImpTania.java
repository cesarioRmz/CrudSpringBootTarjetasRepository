package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.Imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.ArtistasTania;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Repository.ArtistasRepositoryTania;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.IArtistasTania;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))

public class ArtistasImpTania  implements IArtistasTania {
	
	@Autowired
	ArtistasRepositoryTania artistasRepositoryTania;
	@Override
	public List<ArtistasTania> consultarArtistas() {
		List<ArtistasTania> listarArtistas = artistasRepositoryTania.consultarArtistas();
		return listarArtistas;
	}

	
	public void guardar(ArtistasTania artista) {

	artistasRepositoryTania.guardarArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
			artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
			artista.getAnio_retiro());
	
	}
		
	@Override
	public void editar(ArtistasTania artista) {
		artistasRepositoryTania.actualizaArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(), 
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(),artista.getEdad(),
				artista.getAnio_retiro());
		
		
	}

	@Override
	public void eliminar(ArtistasTania artista) {
		artistasRepositoryTania.eliminaArtista(artista.getId());
		
	}

	@Override
	public ArtistasTania buscarArtistas(ArtistasTania artista) {
		// TODO Auto-generated method stub
		return null;
	}


}
