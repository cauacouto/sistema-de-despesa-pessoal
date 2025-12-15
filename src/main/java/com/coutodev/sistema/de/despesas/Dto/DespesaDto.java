package com.coutodev.sistema.de.despesas.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record DespesaDto(String titulo, Double valor, String categoria,
                         @JsonFormat(pattern = "dd/MM/yyyy")
                         LocalDate data) {
}
