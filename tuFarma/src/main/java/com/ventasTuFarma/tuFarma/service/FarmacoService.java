package com.ventasTuFarma.tuFarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventasTuFarma.tuFarma.model.Farmaco;
import com.ventasTuFarma.tuFarma.repository.FarmacoRepository;

@Service
public class FarmacoService {
	
	
	@Autowired
	private FarmacoRepository farmacoRepository;
	
	public List<Farmaco> obtenerFarmacos(){
		return farmacoRepository.findAll();
	}
	
	public Farmaco guardar(Farmaco farmaco) {
		return farmacoRepository.save(farmaco);
	}
	
	public Farmaco obtenerPorId(Long id) {
	    return farmacoRepository.findById(id).orElse(null);
	}

	public void eliminar(Long id) {
	    farmacoRepository.deleteById(id);
	}

	
	

}
