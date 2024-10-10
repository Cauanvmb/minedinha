package br.gov.sp.fatec.projeto_spring_2024.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projeto_spring_2024.entity.Anuncio;
import br.gov.sp.fatec.projeto_spring_2024.service.IAnuncioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/anuncio")
public class AnuncioController {

    @Autowired
    private IAnuncioService service;

    @GetMapping
    public List<Anuncio> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Anuncio cadastrarAnuncio(@RequestBody Anuncio anuncio) {
        return service.cadastrarAnuncio(anuncio);
    }

    @GetMapping(value = "{data_hora}/{preco}")
    public List<Anuncio> buscarPorData_HoraEPreco(@PathVariable("data_hora") LocalDateTime data_hora, @PathVariable("preco") Float preco){
        return service.buscarPorData_HoraEPreco(data_hora, preco);
    }
}
