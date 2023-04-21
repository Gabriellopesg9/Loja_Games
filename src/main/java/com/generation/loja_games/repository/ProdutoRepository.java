package com.generation.loja_games.repository;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.loja_games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("Nome") String nome);
	
	public List<Produto> findAllByPrecoLessThanEqual(BigDecimal preco);
	
	public List<Produto> findAllByPrecoGreaterThanEqual(BigDecimal preco);
	

}
