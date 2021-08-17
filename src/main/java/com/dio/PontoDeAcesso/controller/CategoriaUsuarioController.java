package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.CategoriaUsuario;
import com.dio.PontoDeAcesso.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList() {
        return categoriaUsuarioService.findAll();

    }

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuarioTrabalho) {
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuarioTrabalho);
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws NoSuchElementException {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoriaUsuario).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuarioTrabalho) {
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuarioTrabalho);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) {
        categoriaUsuarioService.deleteCategoriaUsuario(idCategoriaUsuario);
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }


}
