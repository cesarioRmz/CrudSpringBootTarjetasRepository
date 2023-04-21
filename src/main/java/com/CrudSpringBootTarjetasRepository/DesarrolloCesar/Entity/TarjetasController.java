package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;
import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Service.Imp.TarjetasImp;

@RestController
@RequestMapping("TarjetasController")
@CrossOrigin
public class TarjetasController {
	
	@Autowired
	TarjetasImp imp;
	
	
	@GetMapping("GetAllCards")
	public List<Tarjetas> consultaTarjetas(){
		return imp.consultaTarjetas();
	}
	
	
}
