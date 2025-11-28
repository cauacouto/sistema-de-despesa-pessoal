package com.coutodev.sistema.de.despesas.Dto;

import java.time.LocalDate;

public record DespesaDto(String titulo, Double valor, String categoria, LocalDate data) {
}
