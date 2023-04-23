package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Direccion2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Repository.ArtistasRepository;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.IArtistas;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArtistasImp implements IArtistas {

	@Autowired
	ArtistasRepository artistasRepository;

	@Override
	public List<Artistas> consultarArtistas() {
		List<Artistas> listarArtistas = artistasRepository.consultarArtistas();
		return listarArtistas;
	}

	public void guardar(Artistas artista) {

		artistasRepository.guardarArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(),
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(), artista.getEdad(),
				artista.getAnio_retiro());

	}

	@Override
	public void editar(Artistas artista) {
		artistasRepository.actualizarArtista(artista.getId(), artista.getNombre(), artista.getApellidos(),
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(), artista.getEdad(),
				artista.getAnio_retiro());
	}

	@Override
	public void eliminar(Artistas artista) {
		artistasRepository.eliminarArtista(artista.getId());

	}

	@Override
	public Artistas buscarArtistas(Artistas artista) {
		// Artistas bart = artistasRepository.buscarArtistas(artista.getId());
		// return bart;
		return artistasRepository.buscarArtistas(artista.getId());
	}

	@Override
	public ResposeUnion artdireccion(Artistas2 artista2) {

		Artistas2 art = artistasRepository.UnionArtistas(artista2.getId());
		Direccion2 dir = artistasRepository.UnionDireccion(art.getId());

		ResposeUnion response = new ResposeUnion();
		response.setArt2(art);
		response.setDir2(dir);

		return response;

		/*
		 * CAPA IMPLEMENTACION Artistas2 art =
		 * artistasRepository.buscarArtistas(artistas.getId());
		 * 
		 * Direccion dir = Artirtasrepository.buscarDireccion(art.getId());
		 * 
		 * ResponseArtistas response = new ResponseArtistas();
		 * response.setArtistas(art); response.setDireccion(Direccion);
		 * 
		 * return ResponseArtistas;
		 */
	}

}
