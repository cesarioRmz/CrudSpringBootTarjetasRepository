package com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Service;

import java.util.List;

import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Entity.Artistas;

public interface IArtistas {
	public List <Artistas> consultaArtistas();
	public void guardar(Artistas artistas);
	public void editar (Artistas artistas);
	public void eliminar (Artistas artistas);
	public Artistas buscarArtistas(Artistas artistas);
}
