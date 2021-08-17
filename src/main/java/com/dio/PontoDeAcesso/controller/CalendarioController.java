package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Calendario;
import com.dio.PontoDeAcesso.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;

    @GetMapping
    public List<Calendario> getCalendarioList() {
        return calendarioService.findAll();

    }

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendarioTrabalho) {
        return calendarioService.saveCalendario(calendarioTrabalho);
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long idCalendario) throws NoSuchElementException {
        return ResponseEntity.ok(calendarioService.getById(idCalendario).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendarioTrabalho) {
        return calendarioService.updateCalendario(calendarioTrabalho);
    }

    @DeleteMapping("/{idCalendario}")
    public ResponseEntity deleteByID(@PathVariable("idCalendario") Long idCalendario) {
        calendarioService.deleteCalendario(idCalendario);
        return (ResponseEntity<Calendario>) ResponseEntity.ok();

    }


}
