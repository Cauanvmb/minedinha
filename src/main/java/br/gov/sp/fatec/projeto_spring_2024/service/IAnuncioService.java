package br.gov.sp.fatec.projeto_spring_2024.service;

import java.time.LocalDateTime;
import java.util.List;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anuncio;

public interface IAnuncioService {

    public List<Anuncio> buscarTodos();

    public Anuncio cadastrarAnuncio(Anuncio anuncio);

    public List<Anuncio> buscarPorData_HoraEPreco(LocalDateTime data_hora, Float preco);

}
