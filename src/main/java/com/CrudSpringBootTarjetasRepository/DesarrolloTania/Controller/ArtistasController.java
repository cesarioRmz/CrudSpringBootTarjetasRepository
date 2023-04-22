package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.Imp.ArtistasImp;

@RestController
@RequestMapping("Artistas")
@CrossOrigin
public class ArtistasController {
	
	@Autowired
	ArtistasImp implementacion;
	
	@GetMapping("consultar")
	public List<Artistas> consultaArtistas(){
		List<Artistas> listarArtistas = implementacion.consultarArtistas();
		return listarArtistas;
	}
	
	@PostMapping("guardar")
	public void guardar (@RequestBody Artistas artista) {
		implementacion.guardar(artista);
	}
	
	@PostMapping("editar")
	public void editar (@RequestBody Artistas artista) {
		implementacion.editar(artista);
	}
	
	@PostMapping("eliminar")
	public void eliminar (Artistas artista) {
		implementacion.eliminar(artista);
	}
	
}
