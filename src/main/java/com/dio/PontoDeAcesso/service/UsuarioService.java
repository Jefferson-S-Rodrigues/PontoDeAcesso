package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Usuario;
import com.dio.PontoDeAcesso.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuarioTrabalho) {
        return usuarioRepository.save(usuarioTrabalho);

    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    public Usuario updateUsuario(Usuario usuarioTrabalho) {
        return usuarioRepository.save(usuarioTrabalho);

    }

    public void deleteUsuario(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
