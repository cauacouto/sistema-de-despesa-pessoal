package com.coutodev.sistema.de.despesas.service;

import com.coutodev.sistema.de.despesas.Dto.DespesaDto;
import com.coutodev.sistema.de.despesas.model.Despesa;
import com.coutodev.sistema.de.despesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    public void criarDespesa(DespesaDto dto){
        Despesa despesa = new Despesa();
        despesa.setTitulo(dto.titulo());
        despesa.setValor(dto.valor());
        despesa.setCategoria(dto.categoria());
        despesa.setData(dto.data());
        repository.save(despesa);
    }

    public List<Despesa> listarDespesas(){
        return repository.findAll();
    }

    public Double calcularDispesas(){
        return listarDespesas()
                .stream()
                .mapToDouble(Despesa::getValor)
                .sum();
    }
}
