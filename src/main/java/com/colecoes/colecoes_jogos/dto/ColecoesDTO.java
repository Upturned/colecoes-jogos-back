package com.colecoes.colecoes_jogos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColecoesDTO {


    private Long idColecoes;
    private Long idColecionadores;
    private Long idPlataformas;
    private Date dtCadastroColecao;
    
}
