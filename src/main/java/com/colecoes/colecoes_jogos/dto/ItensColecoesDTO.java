package com.colecoes.colecoes_jogos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItensColecoesDTO {
    
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
