package com.unifacisa.Ouvidoria.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String nome;
	
	@ManyToMany
	@JoinTable(
			name = "usuario_manifestacao",
			joinColumns = @JoinColumn(name = "usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "manifestacao_id"))
	private List<Manifestacao> manifestacoes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Manifestacao> getManifestacoes() {
		return manifestacoes;
	}

	public void setManifestacoes(List<Manifestacao> manifestacoes) {
		this.manifestacoes = manifestacoes;
	}
}
