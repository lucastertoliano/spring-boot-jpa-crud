package com.unifacisa.Ouvidoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.Ouvidoria.entity.Usuario;
import com.unifacisa.Ouvidoria.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deletar(long id ) {
		if(usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
		} else {
			throw new RuntimeException("Tipo não encontrada com ID " + id);
		}
	}
}
