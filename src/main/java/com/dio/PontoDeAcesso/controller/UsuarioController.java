package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Usuario;
import com.dio.PontoDeAcesso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarioList() {
        return usuarioService.findAll();

    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuarioTrabalho) {
        return usuarioService.saveUsuario(usuarioTrabalho);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idUsuario) throws NoSuchElementException {
        return ResponseEntity.ok(usuarioService.getById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuarioTrabalho) {
        return usuarioService.updateUsuario(usuarioTrabalho);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idUsuario") Long idUsuario) {
        usuarioService.deleteUsuario(idUsuario);
        return (ResponseEntity<Usuario>) ResponseEntity.ok();

    }


}
