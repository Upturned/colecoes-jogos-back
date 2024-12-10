package com.colecoes.colecoes_jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colecoes.colecoes_jogos.entity.ColecionadoresEntity;

@Repository
public interface ColecionadoresRepository extends JpaRepository<ColecionadoresEntity, Long> {
    
}
