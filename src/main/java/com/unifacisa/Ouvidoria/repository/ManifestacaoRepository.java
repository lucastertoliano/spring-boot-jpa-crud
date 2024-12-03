package com.unifacisa.Ouvidoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifacisa.Ouvidoria.entity.Manifestacao;

@Repository
public interface ManifestacaoRepository extends JpaRepository<Manifestacao, Long> {

}
