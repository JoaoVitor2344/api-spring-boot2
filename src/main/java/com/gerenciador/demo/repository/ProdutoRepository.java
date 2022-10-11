package com.gerenciador.demo.repository;

import com.gerenciador.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
