package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity.Tarjetas;
import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Repository.TarjetasRepository;
import com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Service.ITarjetas;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TarjetasImp implements ITarjetas{

	@Autowired
	TarjetasRepository tarjetasRepository;
	
	@Override
	public List<Tarjetas> consultaTarjetas() {
		List<Tarjetas> lista = tarjetasRepository.getAllTarjetas();
		return lista;
	}
/*
	@Override
	public void editar(Tarjetas tarjetas) {
		tarjetasRepository.updateTarjetas(tarjetas);*/
		
	//}

}
