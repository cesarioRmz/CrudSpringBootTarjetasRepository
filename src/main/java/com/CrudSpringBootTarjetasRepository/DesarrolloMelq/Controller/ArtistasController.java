package com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.DesarrolloMelq.Service.Imp.ArtistasImp;

@RestController
@RequestMapping("ArtistasController")
@CrossOrigin
public class ArtistasController {
	@Autowired
	ArtistasImp imp;
	
	@GetMapping("getAllArtistas")
	public List<Artistas> consultaArtistas(){
		List<Artistas> listaArtistas = imp.consultaArtistas();
		return listaArtistas;
	}
	
	@PostMapping("insertarArtista")
	public void insertar(@RequestBody Artistas artistas) {
		imp.guardar(artistas);
	}
	
	@PostMapping("editarArtista")
	public void editar(@RequestBody Artistas artistas) {
		imp.editar(artistas);
	}
	
	@PostMapping("eliminarArtista")
	public void eliminar(@RequestBody Artistas artistas) {
		imp.eliminar(artistas);
	}
	
	@PostMapping("buscarArtista")
	public Artistas buscarArtista(@RequestBody Artistas artistas) {
		Artistas artista = imp.buscarArtistas(artistas);
		return artista;
	}
}
