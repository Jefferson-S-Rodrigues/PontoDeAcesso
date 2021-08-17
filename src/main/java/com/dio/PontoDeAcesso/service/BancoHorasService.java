package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.BancoHoras;
import com.dio.PontoDeAcesso.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {


    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras saveBancoHoras(BancoHoras bancoHorasTrabalho) {
        return bancoHorasRepository.save(bancoHorasTrabalho);

    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(BancoHoras.BancoHorasId idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public BancoHoras updateBancoHoras(BancoHoras bancoHorasTrabalho) {
        return bancoHorasRepository.save(bancoHorasTrabalho);

    }

    public void deleteBancoHoras(BancoHoras.BancoHorasId idBancoHoras) {
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}
