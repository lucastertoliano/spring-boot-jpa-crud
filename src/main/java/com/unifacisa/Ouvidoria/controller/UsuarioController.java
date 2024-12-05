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

import com.unifacisa.Ouvidoria.entity.Usuario;
import com.unifacisa.Ouvidoria.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listarUsuarios() {
		return usuarioService.listar();
	}
	
	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);
	}
	
	@DeleteMapping("/{id}")
	public void deletarTipo(@PathVariable long id) {
		usuarioService.deletar(id);
	}
}
