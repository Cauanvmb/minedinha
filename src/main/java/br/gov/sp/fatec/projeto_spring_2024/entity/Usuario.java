package br.gov.sp.fatec.projeto_spring_2024.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usr_usuario")
public class Usuario {
    
    @Id//significa que é PK
    @Column(name = "usr_id")//name = "nome da coluna referenciada"
    @GeneratedValue(strategy = GenerationType.IDENTITY)// quando é auto_increment
    private Long id;

    @Column(name = "usr_nome")
    private String nome;
    
    @Column(name = "usr_senha")
    private String senha;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario() { }
    
    public Usuario(String nome, String senha) {
    this();
    this.nome = nome;
    this.senha = senha;
    }
   
}

// tabela implementada abaixo:
// create table usr_usuario (
//  usr_id bigint unsigned not null auto_increment,
//  usr_nome varchar(20) not null,
//  usr_senha varchar(150) not null,
//  primary key (usr_id),
//  unique key uni_usuario_nome (usr_nome)
// );

// • @Entity – Indica que a classe mapeia uma tabela;
// • @Table – Utilizada quando o nome da tabela difere do nome da classe. Aqui você indica, no 
// parâmetro "name", o nome da tabela mapeada;
// • @Column – Utilizada quando o nome do atributo difere do nome da coluna. Aqui você indica, 
// no parâmetro "name", o nome da coluna associada ao atributo;
// • @Id – Essa anotação deve ser colocada antes do atributo associado à coluna que possui a 
// restrição de chave primária;
// • @GeneratedValue – Essa anotação deve ser utilizada quando o valor do atributo é gerado 
// automaticamente. O parâmetro "strategy" deve ser configurado com o tipo de geração utilizado 
// ("GenerationType.IDENTITY" corresponde a "auto_increment").