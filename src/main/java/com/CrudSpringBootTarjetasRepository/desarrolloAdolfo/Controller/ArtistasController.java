package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.Imp.ArtistasImp;

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
	
	@PostMapping("actualizar")
	public void actualizar(@RequestBody Artistas artista) {
		implementacion.editar(artista);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Artistas artista) {
		implementacion.eliminar(artista);
	}
	
	@PostMapping("buscar")
	public Artistas buscarArtistas (@RequestBody Artistas artistas) {
		Artistas bArtistas= implementacion.buscarArtistas(artistas);
		return bArtistas;
		
	}
	
	@PostMapping("direccion")
	public ResposeUnion artdireccion (@RequestBody Artistas2 artista) {
		ResposeUnion union = implementacion.artdireccion(artista);
		return union;
	}
	
	

	
	
	
	
	

}
