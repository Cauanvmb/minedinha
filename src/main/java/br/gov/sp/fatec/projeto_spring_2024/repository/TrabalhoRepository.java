package br.gov.sp.fatec.projeto_spring_2024.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.projeto_spring_2024.entity.Trabalho;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

    @Query("select t from Trabalho t where t.titulo like %?1% and t.nota > ?2")
    public List<Trabalho> buscarPorPalavraENota(String palavra, Long numero);
}

// Crie um repositório para a classe criada no item 1 contendo uma consulta
// capaz de buscar todos
// os trabalhos que contenham uma palavra dentro de seu título com nota superior
// a um número
// inteiro. Tanto a palavra quanto o número devem ser recebidos como parâmetro
// do método;
