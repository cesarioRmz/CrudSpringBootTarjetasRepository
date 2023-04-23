package com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ArtistasEntity;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.Artistas2;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Entity.ResposeUnion;
import com.CrudSpringBootTarjetasRepository.desarrolloAdolfo.Service.Imp.ArtistasImpAlonso;

@RestController
@RequestMapping("Artistas")
@CrossOrigin
public class ControllerArtistas {
	
	@Autowired
	ArtistasImpAlonso implementacion;
	
	@GetMapping("consultar")
	public List<ArtistasEntity> consultaArtistas(){
		List<ArtistasEntity> listarArtistas = implementacion.consultarArtistas();
		return listarArtistas;
	}
	
	@PostMapping("guardar")
	public void guardar (@RequestBody ArtistasEntity artista) {
		implementacion.guardar(artista);
	}
	
	@PostMapping("actualizar")
	public void actualizar(@RequestBody ArtistasEntity artista) {
		implementacion.editar(artista);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody ArtistasEntity artista) {
		implementacion.eliminar(artista);
	}
	
	@PostMapping("buscar")
	public ArtistasEntity buscarArtistas (@RequestBody ArtistasEntity artistasEntity) {
		ArtistasEntity bArtistas= implementacion.buscarArtistas(artistasEntity);
		return bArtistas;
		
	}
	
	@PostMapping("direccion")
	public ResposeUnion artdireccion (@RequestBody Artistas2 artista) {
		ResposeUnion union = implementacion.artdireccion(artista);
		return union;
	}
	
	

	
	
	
	
	

}
