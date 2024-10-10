package br.gov.sp.fatec.projeto_spring_2024.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anc_anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anc_id")
    private Long id;

    @Column(name = "anc_nome_produto")
    private String nome;

    @Column(name = "anc_descricao")
    private String descricao;

    @Column(name = "anc_data_hora")
    private LocalDateTime data_hora;

    @Column(name = "anc_preco")
    private Float preco;

    @Column(name = "anc_peso")
    private Float peso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Anuncio(){

    }

    public Anuncio(String nome, String descricao, LocalDateTime data_hora, Float preco, Float peso) {
        this();
        this.nome = nome;
        this.descricao = descricao;
        this.data_hora = data_hora;
        this.preco = preco;
        this.peso = peso;
    }


    
    

}

// create table anc_anuncio (
// anc_id bigint primary key auto_increment,
// anc_nome_produto varchar(100) not null,
// anc_descricao varchar(200),
// anc_data_hora datetime not null,
// anc_preco float,
// anc_peso float
// );

// insert into anc_anuncio (anc_nome_produto, anc_data_hora, anc_peso) values
// ('Resistência 6800w', '2024-03-15 23:59:59', 0.2),
// ('Liquidificador', current_timestamp(), null)

