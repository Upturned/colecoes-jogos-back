package com.colecoes.colecoes_jogos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colecoes.colecoes_jogos.dto.ColecionadoresDTO;
import com.colecoes.colecoes_jogos.entity.ColecionadoresEntity;
import com.colecoes.colecoes_jogos.repository.ColecionadoresRepository;

@Service
public class ColecionadoresService {

    @Autowired
    ColecionadoresRepository colecionadoresRepository;

    public List<ColecionadoresDTO> findAllColecionadores() {
        List<ColecionadoresEntity> listaColecionadoresEntity = colecionadoresRepository.findAll();
        List<ColecionadoresDTO> listaDTO = new ArrayList<>();

        for (int i = 0; i < listaColecionadoresEntity.size(); i++) {
            listaDTO.add(new ColecionadoresDTO(
                listaColecionadoresEntity.get(i).getIdColecionadores(),
                listaColecionadoresEntity.get(i).getIdPessoas(),
                listaColecionadoresEntity.get(i).getNmUsuarioInterno(),
                listaColecionadoresEntity.get(i).getDtCadastro()
            ));
        }

        return listaDTO;
    }

    public ColecionadoresDTO findColecionador(Long id) {
        ColecionadoresEntity colecionadoresEntity = colecionadoresRepository.findById(id).orElseThrow(() -> new RuntimeException("Deu ruim ao procurar!"));
        return new ColecionadoresDTO(
            colecionadoresEntity.getIdColecionadores(), 
            colecionadoresEntity.getIdPessoas(),
            colecionadoresEntity.getNmUsuarioInterno(),
            colecionadoresEntity.getDtCadastro()
        );
    }

    public ColecionadoresDTO saveColecionador(ColecionadoresDTO colecionadoresDTO) {
        ColecionadoresEntity colecionadoresEntity = new ColecionadoresEntity();

        colecionadoresEntity.setIdPessoas(colecionadoresDTO.getIdPessoas());
        colecionadoresEntity.setNmUsuarioInterno(colecionadoresDTO.getNmUsuarioInterno());
        colecionadoresEntity.setDtCadastro(colecionadoresDTO.getDtCadastro());

        ColecionadoresEntity result = colecionadoresRepository.save(colecionadoresEntity);

        return new ColecionadoresDTO(
            result.getIdColecionadores(),
            result.getIdPessoas(),
            result.getNmUsuarioInterno(),
            result.getDtCadastro()
        );
    }

    public ColecionadoresDTO updateColecionadores(Long id, ColecionadoresDTO colecionadoresDTO) {
        ColecionadoresEntity colecionadoresEntity = colecionadoresRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Deu ruim ao procurar o registro pra atualizar!")
        );
        
        //Unica coluna atualizavel para este caso. Only updatable column for this case.
        colecionadoresEntity.setNmUsuarioInterno(colecionadoresDTO.getNmUsuarioInterno());

        ColecionadoresEntity result = colecionadoresRepository.save(colecionadoresEntity);
        return new ColecionadoresDTO(
            result.getIdColecionadores(),
            result.getIdPessoas(),
            result.getNmUsuarioInterno(),
            result.getDtCadastro()
        );
    }

    public void deleteColecionador(Long id) {
        if (!colecionadoresRepository.existsById(id)) {
            throw new RuntimeException("Colecionador não encontrado!");
        }
        colecionadoresRepository.deleteById(id);
    }

}
