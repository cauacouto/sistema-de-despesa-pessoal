package com.coutodev.sistema.de.despesas.repository;

import com.coutodev.sistema.de.despesas.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa,Integer> {
}
