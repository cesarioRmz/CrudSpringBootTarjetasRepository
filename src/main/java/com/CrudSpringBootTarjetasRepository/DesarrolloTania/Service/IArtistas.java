package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service;

import java.util.List;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.Artistas;


public interface IArtistas {

	public List<Artistas> consultarArtistas();
	public void guardar (Artistas artista);
	public void editar (Artistas artista);
	public void eliminar (Artistas artista);
	public Artistas buscarArtistas(Artistas artista);
	

}
