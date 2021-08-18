package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Localidade;
import com.dio.PontoDeAcesso.service.LocalidadeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidade")
@Api(tags = {"Localidade"}, description = "Localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;

    @GetMapping
    public List<Localidade> getLocalidadeList() {
        return localidadeService.findAll();

    }

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidadeTrabalho) {
        return localidadeService.saveLocalidade(localidadeTrabalho);
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeByID(@PathVariable("idLocalidade") Long idLocalidade) throws NoSuchElementException {
        return ResponseEntity.ok(localidadeService.getById(idLocalidade).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidadeTrabalho) {
        return localidadeService.updateLocalidade(localidadeTrabalho);
    }

    @DeleteMapping("/{idLocalidade}")
    public ResponseEntity deleteByID(@PathVariable("idLocalidade") Long idLocalidade) {
        localidadeService.deleteLocalidade(idLocalidade);
        return (ResponseEntity<Localidade>) ResponseEntity.ok();

    }


}
