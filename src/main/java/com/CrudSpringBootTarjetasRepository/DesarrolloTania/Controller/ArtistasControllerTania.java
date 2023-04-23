package com.CrudSpringBootTarjetasRepository.DesarrolloTania.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Entity.ArtistasTania;
import com.CrudSpringBootTarjetasRepository.DesarrolloTania.Service.Imp.ArtistasImpTania;

@RestController
@RequestMapping("ArtistasTania")
@CrossOrigin
public class ArtistasControllerTania {
	
	@Autowired
	ArtistasImpTania implementacion;
	
	@GetMapping("consultar")
	public List<ArtistasTania> consultaArtistas(){
		List<ArtistasTania> listarArtistas = implementacion.consultarArtistas();
		return listarArtistas;
	}
	
	@PostMapping("guardar")
	public void guardar (@RequestBody ArtistasTania artista) {
		implementacion.guardar(artista);
	}
	
	@PostMapping("editar")
	public void editar (@RequestBody ArtistasTania artista) {
		implementacion.editar(artista);
	}
	
	@PostMapping("eliminar")
	public void eliminar (ArtistasTania artista) {
		implementacion.eliminar(artista);
	}
	
}
