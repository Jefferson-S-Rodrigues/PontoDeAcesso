package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Empresa;
import com.dio.PontoDeAcesso.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {


    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa saveEmpresa(Empresa empresaTrabalho) {
        return empresaRepository.save(empresaTrabalho);

    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa) {
        return empresaRepository.findById(idEmpresa);
    }

    public Empresa updateEmpresa(Empresa empresaTrabalho) {
        return empresaRepository.save(empresaTrabalho);

    }

    public void deleteEmpresa(Long idEmpresa) {
        empresaRepository.deleteById(idEmpresa);
    }
}
