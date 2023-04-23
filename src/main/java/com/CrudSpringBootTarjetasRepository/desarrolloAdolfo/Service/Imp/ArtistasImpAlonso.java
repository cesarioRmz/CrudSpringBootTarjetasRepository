package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ArtistasEntity;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Direccion2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Repository.ArtistasRepositoryAlonso;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.IArtistasAlonso;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArtistasImpAlonso implements IArtistasAlonso {

	@Autowired
	ArtistasRepositoryAlonso artistasRepositoryAlonso;

	@Override
	public List<ArtistasEntity> consultarArtistas() {
		List<ArtistasEntity> listarArtistas = artistasRepositoryAlonso.consultarArtistas();
		return listarArtistas;
	}

	public void guardar(ArtistasEntity artista) {

		artistasRepositoryAlonso.guardarArtistas(artista.getId(), artista.getNombre(), artista.getApellidos(),
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(), artista.getEdad(),
				artista.getAnio_retiro());

	}

	@Override
	public void editar(ArtistasEntity artista) {
		artistasRepositoryAlonso.actualizarArtista(artista.getId(), artista.getNombre(), artista.getApellidos(),
				artista.getGenero(), artista.getCancion_famosa(), artista.getAlbum(), artista.getEdad(),
				artista.getAnio_retiro());
	}

	@Override
	public void eliminar(ArtistasEntity artista) {
		artistasRepositoryAlonso.eliminarArtista(artista.getId());

	}

	@Override
	public ArtistasEntity buscarArtistas(ArtistasEntity artista) {
		// Artistas bart = artistasRepository.buscarArtistas(artista.getId());
		// return bart;
		return artistasRepositoryAlonso.buscarArtistas(artista.getId());
	}

	@Override
	public ResposeUnion artdireccion(Artistas2 artista2) {

		Artistas2 art = artistasRepositoryAlonso.UnionArtistas(artista2.getId());
		Direccion2 dir = artistasRepositoryAlonso.UnionDireccion(art.getId());

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
