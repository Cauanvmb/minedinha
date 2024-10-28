package br.gov.sp.fatec.projeto_spring_2024.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projeto_spring_2024.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    public Optional<Usuario> findByNome(String nomeUsuario);
    
}