package com.gerenciador.demo.repository;

import com.gerenciador.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    
}
