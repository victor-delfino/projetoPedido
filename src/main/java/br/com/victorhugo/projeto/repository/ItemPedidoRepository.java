package br.com.victorhugo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victorhugo.projeto.entity.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Long> {
    
}
