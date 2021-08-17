package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Ocorrencia;
import com.dio.PontoDeAcesso.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {


    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrenciaTrabalho) {
        return ocorrenciaRepository.save(ocorrenciaTrabalho);

    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(Long idOcorrencia) {
        return ocorrenciaRepository.findById(idOcorrencia);
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrenciaTrabalho) {
        return ocorrenciaRepository.save(ocorrenciaTrabalho);

    }

    public void deleteOcorrencia(Long idOcorrencia) {
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}