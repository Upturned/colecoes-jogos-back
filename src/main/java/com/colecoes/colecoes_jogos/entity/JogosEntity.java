package com.colecoes.colecoes_jogos.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "jogos", schema = "sc_col_jogos")
@Entity
public class JogosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJogos;

    private String nmJogo;

    private String idSerie;

    private String nmSerie;

    private Date dtLancamento;

    private String nmDesenvolvedora;

    private String nmPublisher;

    private String dsGenero;

    private Long nrMediaHoras;

    private String dsObservacao;

}
