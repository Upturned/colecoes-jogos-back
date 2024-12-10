package com.colecoes.colecoes_jogos.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "colecionadores", schema = "sc_col_jogos")
@Entity
public class ColecionadoresEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColecionadores;
    
    private Long idPessoas;

    private String nmUsuarioInterno;

    private Date dtCadastro;

}
