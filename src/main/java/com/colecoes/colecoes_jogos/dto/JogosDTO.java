package com.colecoes.colecoes_jogos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JogosDTO {

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
