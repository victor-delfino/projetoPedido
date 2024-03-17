package br.com.victorhugo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victorhugo.projeto.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque,Long>{
    
}
