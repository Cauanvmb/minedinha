package br.gov.sp.fatec.projeto_spring_2024.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projeto_spring_2024.entity.Trabalho;
import br.gov.sp.fatec.projeto_spring_2024.service.ITrabalhoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {
    private ITrabalhoService service;

    @GetMapping
    public List<Trabalho> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Trabalho cadastrarTrabalho(@RequestBody Trabalho trabalho) {
        return service.cadastrarTrabalho(trabalho);
    }

    @GetMapping(value = "/{palavra}&{nota}")
    public List<Trabalho> consultaEspecifica(@PathVariable("palavra") String palavra, @PathVariable("nota") Long nota){
        return service.consultaEspecifica(palavra, nota);
    }
}