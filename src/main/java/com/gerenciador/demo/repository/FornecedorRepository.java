package com.gerenciador.demo.repository;

import com.gerenciador.demo.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer>{
    
}
