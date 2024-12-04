package com.unifacisa.Ouvidoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.Ouvidoria.entity.Descricao;
import com.unifacisa.Ouvidoria.repository.DescricaoRepository;

@Service
public class DescricaoService {

	@Autowired
	private DescricaoRepository descricaoRepository;

	public List<Descricao> listar() {
		return descricaoRepository.findAll();
	}

	public Descricao salvar(Descricao descricao) {
		return descricaoRepository.save(descricao);
	}
}
