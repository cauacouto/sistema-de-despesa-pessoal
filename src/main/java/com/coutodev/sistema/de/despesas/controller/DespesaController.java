package com.coutodev.sistema.de.despesas.controller;

import com.coutodev.sistema.de.despesas.Dto.DespesaDto;
import com.coutodev.sistema.de.despesas.model.Despesa;
import com.coutodev.sistema.de.despesas.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    private DespesaService service;

    @PostMapping
    public ResponseEntity<Void> criarDespesa(@RequestBody DespesaDto dto){
        service.criarDespesa(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @GetMapping
    public ResponseEntity<List<Despesa>> listarDespesas(){
        return ResponseEntity.ok(service.listarDespesas());
    }
    @GetMapping("/total")
    public ResponseEntity<Double> calcularDespesas(){
        return ResponseEntity.ok(service.calcularDispesas());
    }
}
