package br.gov.sp.fatec.projeto_spring_2024.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anuncio;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

    @Query("select a from Anuncio a where a.data_hora > ?1 and a.preco < ?2")
    public List<Anuncio> buscarPorData_HoraEPreco(LocalDateTime data_hora, Float preco);


}
