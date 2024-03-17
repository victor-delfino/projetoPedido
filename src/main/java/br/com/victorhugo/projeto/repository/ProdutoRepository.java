package br.com.victorhugo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victorhugo.projeto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    
}
