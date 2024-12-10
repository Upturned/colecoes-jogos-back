package com.colecoes.colecoes_jogos.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "paltaformas", schema = "sc_col_jogos")
@Entity
public class PlataformasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlataformas;

    private Long idGeracoes;

    private String dsPlataforma;

    private String dsFabricante;

    private Date dtLancamento;

    private Date dtEncerramento;

    private String dsDescricao;
    
    private String dsObservacao;

}
