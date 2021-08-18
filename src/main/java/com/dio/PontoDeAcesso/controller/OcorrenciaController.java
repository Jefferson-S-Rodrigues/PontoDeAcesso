package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Ocorrencia;
import com.dio.PontoDeAcesso.service.OcorrenciaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
@Api(tags = {"Ocorrência"}, description = "Registros de ocorrências")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaService.findAll();

    }

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws NoSuchElementException {
        return ResponseEntity.ok(ocorrenciaService.getById(idOcorrencia).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity deleteByID(@PathVariable("idOcorrencia") Long idOcorrencia) {
        ocorrenciaService.deleteOcorrencia(idOcorrencia);
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();

    }


}
