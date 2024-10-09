package br.gov.sp.fatec.projeto_spring_2024.service;

import java.util.List;

import br.gov.sp.fatec.projeto_spring_2024.entity.Trabalho;

public interface ITrabalhoService {
    public Trabalho cadastrarTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodos();

    public List<Trabalho> consultaEspecifica(String palavra, Long nota);

}
