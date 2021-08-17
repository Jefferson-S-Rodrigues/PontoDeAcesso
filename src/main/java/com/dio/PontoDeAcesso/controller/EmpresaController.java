package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Empresa;
import com.dio.PontoDeAcesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping
    public List<Empresa> getEmpresaList() {
        return empresaService.findAll();

    }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresaTrabalho) {
        return empresaService.saveEmpresa(empresaTrabalho);
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws NoSuchElementException {
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresaTrabalho) {
        return empresaService.updateEmpresa(empresaTrabalho);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deleteByID(@PathVariable("idEmpresa") Long idEmpresa) {
        empresaService.deleteEmpresa(idEmpresa);
        return (ResponseEntity<Empresa>) ResponseEntity.ok();

    }


}
