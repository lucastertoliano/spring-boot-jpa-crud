package com.unifacisa.Ouvidoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.Ouvidoria.entity.Tipo;
import com.unifacisa.Ouvidoria.repository.TipoRepository;

@Service
public class TipoService {
	
	@Autowired
	private TipoRepository tipoRepository;

	public List<Tipo> listar() {
		return tipoRepository.findAll();
	}

	public Tipo salvar(Tipo tipo) {
		return tipoRepository.save(tipo);
	}
	
	public void deletar(long id ) {
		if(tipoRepository.existsById(id)) {
			tipoRepository.deleteById(id);
		} else {
			throw new RuntimeException("Tipo não encontrada com ID " + id);
		}
	}
}

