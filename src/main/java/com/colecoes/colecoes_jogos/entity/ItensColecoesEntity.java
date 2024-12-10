package com.colecoes.colecoes_jogos.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "itens_colecoes", schema = "sc_col_jogos")
@Entity
public class ItensColecoesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItensColecoes;

    private Long idColecoes;

    private Long idJogos;

    private Date dtAdicao;

    private String idMidiaFisica;

    private String idLacrado;

    private String idJogado;

    private String idZerado;

    private String idPlatinado;

    private Long nrHorasGastas;

    private Long nrHorasJogadas;

    private Long nrNotaUmDez;

    private String dsAvaliacao;

    private String dsObservacao;

}
