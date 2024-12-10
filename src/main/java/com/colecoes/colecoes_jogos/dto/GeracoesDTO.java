package com.colecoes.colecoes_jogos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeracoesDTO {

    private long idGeracoes;

    private long nrGeracao;

    private String dsGeracao;

    private Long nrAnoInicio;

    private Long nrAnoFim;

    private String dsObservacao;

}
