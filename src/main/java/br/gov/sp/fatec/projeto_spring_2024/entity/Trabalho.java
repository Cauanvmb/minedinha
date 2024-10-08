package br.gov.sp.fatec.projeto_spring_2024.entity;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "tra_trabalho")
public class Trabalho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // not null
    // unique
    private String titulo;

    //not null
    private Timestamp dataHoraEntrega;

    private String descricao;

    // not null
    private String grupo;

    private Integer nota;

    private String justificativa;
}

// create table tra_trabalho (
//  tra_id bigint primary key auto_increment,
//  tra_titulo varchar(100) not null unique,
//  tra_data_hora_entrega datetime not null,
//  tra_descricao varchar(200),
//  tra_grupo varchar(20) not null,
//  tra_nota int,
//  tra_justificativa varchar(100)
// );