package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Movimentacao;
import com.dio.PontoDeAcesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @GetMapping
    public List<Movimentacao> getMovimentacaoList() {
        return movimentacaoService.findAll();

    }

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacaoTrabalho) {
        return movimentacaoService.saveMovimentacao(movimentacaoTrabalho);
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoByID(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId idMovimentacao) throws NoSuchElementException {
        return ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacaoTrabalho) {
        return movimentacaoService.updateMovimentacao(movimentacaoTrabalho);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity deleteByID(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId idMovimentacao) {
        movimentacaoService.deleteMovimentacao(idMovimentacao);
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();

    }


}
