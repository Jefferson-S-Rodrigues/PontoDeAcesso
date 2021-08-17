package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.BancoHoras;
import com.dio.PontoDeAcesso.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancoHoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;

    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();

    }

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHorasTrabalho) {
        return bancoHorasService.saveBancoHoras(bancoHorasTrabalho);
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") BancoHoras.BancoHorasId idBancoHoras) throws NoSuchElementException {
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHorasTrabalho) {
        return bancoHorasService.updateBancoHoras(bancoHorasTrabalho);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity deleteByID(@PathVariable("idBancoHoras") BancoHoras.BancoHorasId idBancoHoras) {
        bancoHorasService.deleteBancoHoras(idBancoHoras);
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();

    }


}
