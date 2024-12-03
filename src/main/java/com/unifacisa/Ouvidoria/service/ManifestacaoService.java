package com.unifacisa.Ouvidoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.Ouvidoria.entity.Manifestacao;
import com.unifacisa.Ouvidoria.repository.ManifestacaoRepository;

@Service
public class ManifestacaoService {
	
	@Autowired
	private ManifestacaoRepository manifestacaoRepository;

	public List<Manifestacao> listar() {
		return manifestacaoRepository.findAll();
	}

	public Manifestacao salvar(Manifestacao manifestacao) {
		return manifestacaoRepository.save(manifestacao);
	}
}
