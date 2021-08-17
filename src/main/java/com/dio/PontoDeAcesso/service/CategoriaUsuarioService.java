package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.CategoriaUsuario;
import com.dio.PontoDeAcesso.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {


    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuarioTrabalho) {
        return categoriaUsuarioRepository.save(categoriaUsuarioTrabalho);

    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoriaUsuario) {
        return categoriaUsuarioRepository.findById(idCategoriaUsuario);
    }

    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuarioTrabalho) {
        return categoriaUsuarioRepository.save(categoriaUsuarioTrabalho);

    }

    public void deleteCategoriaUsuario(Long idCategoriaUsuario) {
        categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
    }
}
