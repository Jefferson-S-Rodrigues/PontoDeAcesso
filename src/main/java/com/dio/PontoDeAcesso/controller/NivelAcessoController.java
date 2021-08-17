package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.NivelAcesso;
import com.dio.PontoDeAcesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList() {
        return nivelAcessoService.findAll();

    }

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcessoTrabalho) {
        return nivelAcessoService.saveNivelAcesso(nivelAcessoTrabalho);
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getNivelAcessoByID(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws NoSuchElementException {
        return ResponseEntity.ok(nivelAcessoService.getById(idNivelAcesso).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcessoTrabalho) {
        return nivelAcessoService.updateNivelAcesso(nivelAcessoTrabalho);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity deleteByID(@PathVariable("idNivelAcesso") Long idNivelAcesso) {
        nivelAcessoService.deleteNivelAcesso(idNivelAcesso);
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();

    }


}
