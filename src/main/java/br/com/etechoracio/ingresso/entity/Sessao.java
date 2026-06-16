package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_SESSAO")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Long id;

    @Column(name = "DT_DATA")
    private LocalDate data;

    @Column(name = "NR_HORARIO")
    private LocalTime horario;

    @JoinTable(name = "TBL_FILME")
    @JoinColumn(name = "ID_FILME")
    @ManyToOne
    private Filme filme;

    @Column(name = "NR_PRECO")
    private double preco;

    @Column(name = "TX_SALA")
    private String sala;
}
