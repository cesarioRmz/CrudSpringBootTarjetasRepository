package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service;

import java.util.List;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ArtistasEntity;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;

public interface IArtistasAlonso {
	
	public List<ArtistasEntity> consultarArtistas();
	public void guardar (ArtistasEntity artista);
	public void editar (ArtistasEntity artista);
	public void eliminar (ArtistasEntity artista);
	public ArtistasEntity buscarArtistas(ArtistasEntity artista);
	public ResposeUnion artdireccion (Artistas2 artista);
	


}
