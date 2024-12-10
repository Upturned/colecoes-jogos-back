package com.colecoes.colecoes_jogos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colecoes.colecoes_jogos.dto.ColecionadoresDTO;
import com.colecoes.colecoes_jogos.service.ColecionadoresService;

@RestController
@RequestMapping("/colecionadores")
public class ColecionadoresController {
    
    @Autowired
    ColecionadoresService colecionadoresService;

    @GetMapping("/buscar-todos-colecionadores")
    public List<ColecionadoresDTO> buscarColecionadores() {
        return colecionadoresService.findAllColecionadores();
    }

    @GetMapping("/buscar-colecionador-id/{id}")
    public ColecionadoresDTO buscarColecionador(@PathVariable Long id) {
        return colecionadoresService.findColecionador(id);
    }

    @PostMapping("/salvar-colecionador")
    public ColecionadoresDTO salvarColecionador(@RequestBody ColecionadoresDTO colecionadoresDTO) {
        return colecionadoresService.saveColecionador(colecionadoresDTO);
    }

    @PutMapping("/atualizar-colecionador/{id}")
    public ColecionadoresDTO atualizarColecionador(@PathVariable Long id, @RequestBody ColecionadoresDTO colecionadoresDTO) {
        return colecionadoresService.updateColecionadores(id, colecionadoresDTO);
    }

    @DeleteMapping("/deletar-colecionador/{id}")
    public void deletarColecionador(@PathVariable Long id) {
        colecionadoresService.deleteColecionador(id);
    }

}
