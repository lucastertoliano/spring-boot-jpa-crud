package com.unifacisa.Ouvidoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Ouvidoria.entity.Tipo;
import com.unifacisa.Ouvidoria.service.TipoService;

@RestController
@RequestMapping("/tipos")
public class TipoController {
	
	@Autowired
	private TipoService tipoService;
	
	@GetMapping
	public List<Tipo> listarTipos() {
		return tipoService.listar();
	}
	
	@PostMapping
	public Tipo criarTipo(@RequestBody Tipo tipo) {
		return tipoService.salvar(tipo);
	}
}