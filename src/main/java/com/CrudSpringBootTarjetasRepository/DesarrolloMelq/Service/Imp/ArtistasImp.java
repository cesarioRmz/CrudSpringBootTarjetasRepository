package com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Repository.ArtistasRepository;
import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Service.IArtistas;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArtistasImp implements IArtistas{
	//private static final String String = null;
	@Autowired
	ArtistasRepository artistasRepository;
	
	@Override
	public List<Artistas> consultaArtistas() {
		List<Artistas> lista = artistasRepository.getAllArtistas();
		return lista;
	}
	
	@Override
	public void guardar(Artistas artistas) {
		artistasRepository.guardarArtistas(artistas.getId(), artistas.getNombre(), artistas.getApellidos(), artistas.getGenero(),
				artistas.getCancion_famosa(), artistas.getAlbum(), artistas.getEdad(), artistas.getAnio_retiro());
	
		
	}

	@Override
	public void editar(Artistas artistas) {
		artistasRepository.editarArtistas(artistas.getId(), artistas.getNombre(), artistas.getApellidos(), artistas.getGenero(),
				artistas.getCancion_famosa(), artistas.getAlbum(), artistas.getEdad(), artistas.getAnio_retiro());	
	}

	@Override
	public void eliminar(Artistas artistas) {
		artistasRepository.eliminarArtistas(artistas.getId());
		
	}

	@Override
	public Artistas buscarArtistas(Artistas artistas) {
		Artistas artista = artistasRepository.buscarArtistas(artistas.getId());
		System.out.println(artista);
		return artista;
	}
}
