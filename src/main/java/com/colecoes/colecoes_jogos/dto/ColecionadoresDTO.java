package com.colecoes.colecoes_jogos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColecionadoresDTO {

    private Long idColecionadores;
    private Long idPessoas;
    private String nmUsuarioInterno;
    private Date dtCadastro;

}