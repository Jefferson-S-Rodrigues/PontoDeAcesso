package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.TipoData;
import com.dio.PontoDeAcesso.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {


    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData saveTipoData(TipoData tipoDataTrabalho) {
        return tipoDataRepository.save(tipoDataTrabalho);

    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData) {
        return tipoDataRepository.findById(idTipoData);
    }

    public TipoData updateTipoData(TipoData tipoDataTrabalho) {
        return tipoDataRepository.save(tipoDataTrabalho);

    }

    public void deleteTipoData(Long idTipoData) {
        tipoDataRepository.deleteById(idTipoData);
    }
}
