package br.com.victorhugo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victorhugo.projeto.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
