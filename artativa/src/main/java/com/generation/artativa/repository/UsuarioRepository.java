package com.generation.artativa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.artativa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> FindAllByNomeContainingIgnoreCase(String nome);
	
}
