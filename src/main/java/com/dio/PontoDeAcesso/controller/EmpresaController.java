package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.Empresa;
import com.dio.PontoDeAcesso.service.EmpresaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
@Api(tags = {"Empresa"}, description = "Dados das empresas")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping
    public List<Empresa> getEmpresaList() {
        return empresaService.findAll();

    }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws NoSuchElementException {
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deleteByID(@PathVariable("idEmpresa") Long idEmpresa) {
        empresaService.deleteEmpresa(idEmpresa);
        return (ResponseEntity<Empresa>) ResponseEntity.ok();

    }


}
