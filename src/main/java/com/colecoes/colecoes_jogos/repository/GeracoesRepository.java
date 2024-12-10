package com.colecoes.colecoes_jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colecoes.colecoes_jogos.entity.GeracoesEntity;

@Repository
public interface GeracoesRepository extends JpaRepository<GeracoesEntity, Long>{

}
