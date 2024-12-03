package com.unifacisa.Ouvidoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Ouvidoria.entity.Manifestacao;
import com.unifacisa.Ouvidoria.service.ManifestacaoService;

@RestController
@RequestMapping("/manifestacoes")
public class ManifestacaoController {

	@Autowired
	private ManifestacaoService manifestacaoService;
	
	@GetMapping
	public List<Manifestacao> listarManifestacao() {
		return manifestacaoService.listar();
	}
	
	@PostMapping
	public Manifestacao criarManifestacao(@RequestBody Manifestacao manifestacao) {
		return manifestacaoService.salvar(manifestacao);
	}
}
