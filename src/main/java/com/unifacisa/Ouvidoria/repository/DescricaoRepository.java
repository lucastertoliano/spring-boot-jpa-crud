package com.unifacisa.Ouvidoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifacisa.Ouvidoria.entity.Descricao;

@Repository
public interface DescricaoRepository extends JpaRepository<Descricao, Long> {

}
