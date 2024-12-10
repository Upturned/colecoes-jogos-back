package com.colecoes.colecoes_jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colecoes.colecoes_jogos.entity.ItensColecoesEntity;

@Repository
public interface ItensColecoesRepository extends JpaRepository<ItensColecoesEntity, Long>{

}
