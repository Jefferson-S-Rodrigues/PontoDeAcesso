package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Usuario;
import com.dio.PontoDeAcesso.service.UsuarioService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
@Api(tags = {"Usuário"}, description = "Dados dos usuários")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarioList() {
        return usuarioService.findAll();

    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idUsuario) throws NoSuchElementException {
        return ResponseEntity.ok(usuarioService.getById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idUsuario") Long idUsuario) {
        usuarioService.deleteUsuario(idUsuario);
        return (ResponseEntity<Usuario>) ResponseEntity.ok();

    }


}
