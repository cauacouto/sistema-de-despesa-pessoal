package com.coutodev.sistema.de.despesas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "despesas")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String titulo;
    private Double valor;
    private String categoria;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

}
