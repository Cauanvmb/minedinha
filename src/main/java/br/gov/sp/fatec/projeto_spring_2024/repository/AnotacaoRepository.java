package br.gov.sp.fatec.projeto_spring_2024.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anotacao;


public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}