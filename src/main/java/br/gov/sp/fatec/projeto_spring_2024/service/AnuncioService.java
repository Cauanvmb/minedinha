package br.gov.sp.fatec.projeto_spring_2024.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anuncio;
import br.gov.sp.fatec.projeto_spring_2024.repository.AnuncioRepository;

@Service
public class AnuncioService implements IAnuncioService{

    @Autowired
    private AnuncioRepository anuncioRepo;

    public List<Anuncio> buscarTodos() {
        return anuncioRepo.findAll();
    }

    public Anuncio cadastrarAnuncio(Anuncio anuncio){
        if(anuncio == null ||
        anuncio.getNome() == null||
        anuncio.getPeso() < 0 ||
        anuncio.getPreco() < 0){
            throw new IllegalArgumentException("Dados inseridos são inválidos!");
        }
        if(anuncio.getData_hora() == null){
            anuncio.setData_hora(LocalDateTime.now());
        }
        return anuncioRepo.save(anuncio);
    }

    public List<Anuncio> buscarPorData_HoraEPreco(LocalDateTime data_hora, Float preco){
        return anuncioRepo.buscarPorData_HoraEPreco(data_hora, preco);
    }


}
