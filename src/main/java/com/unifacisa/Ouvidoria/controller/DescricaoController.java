package com.unifacisa.Ouvidoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Ouvidoria.entity.Descricao;
import com.unifacisa.Ouvidoria.service.DescricaoService;

@RestController
@RequestMapping("/descricoes")
public class DescricaoController {

	@Autowired
	private DescricaoService descricaoService;
	
	@GetMapping
	public List<Descricao> listarDescricoes() {
		return descricaoService.listar();
	}
	
	@PostMapping
	public Descricao criarDescricao(@RequestBody Descricao descricao) {
		return descricaoService.salvar(descricao);
	}
	
	@DeleteMapping("/{id}")
	public void deletarDescricao(@PathVariable long id) {
		descricaoService.deletar(id);
	}
}
