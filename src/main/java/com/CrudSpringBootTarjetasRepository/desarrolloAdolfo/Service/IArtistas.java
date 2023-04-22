package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service;

import java.util.List;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;

public interface IArtistas {
	
	public List<Artistas> consultarArtistas();
	public void guardar (Artistas artista);
	public void editar (Artistas artista);
	public void eliminar (Artistas artista);
	public Artistas buscarArtistas(Artistas artista);
	public ResposeUnion artdireccion (Artistas2 artista);
	


}
