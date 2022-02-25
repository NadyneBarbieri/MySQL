package com.generation.Farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Farmacia.model.ProdutoModel;

public interface ProdutoRepository {
	
	@Repository
	public interface CategoriaRepository extends JpaRepository<ProdutoModel, Long>{
		public List<ProdutoModel>findAllByNomeContainingIgnoreCase(String nome);
		
	}
	

	
}
