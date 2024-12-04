package com.unifacisa.Ouvidoria.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "tipo")
	@JsonBackReference
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
