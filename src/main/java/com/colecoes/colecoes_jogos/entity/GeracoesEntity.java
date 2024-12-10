package com.colecoes.colecoes_jogos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "geracoes", schema = "sc_col_jogos")
@Entity
public class GeracoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGeracoes;

    private long nrGeracao;

    private String dsGeracao;

    private Long nrAnoInicio;

    private Long nrAnoFim;

    private String dsObservacao;

}
