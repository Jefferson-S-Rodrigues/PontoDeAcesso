package com.dio.PontoDeAcesso.controller;

import com.dio.PontoDeAcesso.model.TipoData;
import com.dio.PontoDeAcesso.service.TipoDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipoData")
@Api(tags = {"Tipo de Data"}, description = "Tipos de datas")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @GetMapping
    public List<TipoData> getTipoDataList() {
        return tipoDataService.findAll();

    }

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.saveTipoData(tipoData);
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataByID(@PathVariable("idTipoData") Long idTipoData) throws NoSuchElementException {
        return ResponseEntity.ok(tipoDataService.getById(idTipoData).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity deleteByID(@PathVariable("idTipoData") Long idTipoData) {
        tipoDataService.deleteTipoData(idTipoData);
        return (ResponseEntity<TipoData>) ResponseEntity.ok();

    }


}
