package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.NivelAcesso;
import com.dio.PontoDeAcesso.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {


    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcessoTrabalho) {
        return nivelAcessoRepository.save(nivelAcessoTrabalho);

    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivelAcesso) {
        return nivelAcessoRepository.findById(idNivelAcesso);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcessoTrabalho) {
        return nivelAcessoRepository.save(nivelAcessoTrabalho);

    }

    public void deleteNivelAcesso(Long idNivelAcesso) {
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }
}
