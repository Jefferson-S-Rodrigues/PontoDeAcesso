package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Localidade;
import com.dio.PontoDeAcesso.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {


    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade saveLocalidade(Localidade localidadeTrabalho) {
        return localidadeRepository.save(localidadeTrabalho);

    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade) {
        return localidadeRepository.findById(idLocalidade);
    }

    public Localidade updateLocalidade(Localidade localidadeTrabalho) {
        return localidadeRepository.save(localidadeTrabalho);

    }

    public void deleteLocalidade(Long idLocalidade) {
        localidadeRepository.deleteById(idLocalidade);
    }
}
