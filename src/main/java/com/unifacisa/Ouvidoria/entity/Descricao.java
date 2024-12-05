package com.unifacisa.Ouvidoria.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Descricao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String texto;
	
	@OneToOne
	@JoinColumn(name = "manifestacao_id")
	@JsonBackReference
	private Manifestacao manifestacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Manifestacao getManifestacao() {
		return manifestacao;
	}

	public void setManifestacao(Manifestacao manifestacao) {
		this.manifestacao = manifestacao;
	}	
}
