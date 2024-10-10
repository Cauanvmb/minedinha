package br.gov.sp.fatec.projeto_spring_2024.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projeto_spring_2024.entity.Trabalho;
import br.gov.sp.fatec.projeto_spring_2024.repository.TrabalhoRepository;

@Service
public class TrabalhoService implements ITrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepo;

    public Trabalho cadastrarTrabalho(Trabalho trabalho) {
        if (trabalho == null ||
                trabalho.getTitulo() == null ||
                trabalho.getGrupo() == null) {
            throw new IllegalArgumentException("Titulo e/ou Grupo inválidos!");
        }
        if (trabalho.getDataHoraEntrega() == null) {
            trabalho.setDataHoraEntrega(LocalDateTime.now());
        }
        return trabalhoRepo.save(trabalho);
    }

    public List<Trabalho> buscarTodos() {
        return trabalhoRepo.findAll();
    }

    public List<Trabalho> consultaEspecifica(String palavra, Long nota) {
        return trabalhoRepo.buscarPorPalavraENota(palavra, nota);
    }

}

// Crie um serviço com 3 métodos: um para cadastro, um para listar todos os
// registros da tabela
// e outro para buscar usando a consulta criada no item 2.
// No cadastro verifique se o título e o grupo estejam preenchidos, lançando um
// erro em caso contrário.
// Ainda no cadastro, use a data/hora atual se a data/hora de entrega não
// estiver preenchida;