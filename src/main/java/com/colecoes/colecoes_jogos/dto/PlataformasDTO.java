package com.colecoes.colecoes_jogos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlataformasDTO {

    private Long idPlataformas;

    private Long idGeracoes;

    private String dsPlataforma;

    private String dsFabricante;

    private Date dtLancamento;

    private Date dtEncerramento;

    private String dsDescricao;
    
    private String dsObservacao;
    
}
