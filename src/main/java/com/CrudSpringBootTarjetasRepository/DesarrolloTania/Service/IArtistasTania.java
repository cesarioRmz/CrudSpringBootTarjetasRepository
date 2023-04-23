package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service;

import java.util.List;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.ArtistasTania;


public interface IArtistasTania {

	public List<ArtistasTania> consultarArtistas();
	public void guardar (ArtistasTania artista);
	public void editar (ArtistasTania artista);
	public void eliminar (ArtistasTania artista);
	public ArtistasTania buscarArtistas(ArtistasTania artista);
	

}
