package com.gerenciador.demo.service;

import com.gerenciador.demo.model.Fornecedor;
import com.gerenciador.demo.repository.FornecedorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;
    
    @Override
    public Fornecedor salvaFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @Override
    public List<Fornecedor> listaFornecedores() {
        return fornecedorRepository.findAll();
    }

    @Override
    public Optional<Fornecedor> getByIdFornecedor(Integer codFornecedor) {
        return fornecedorRepository.findById(codFornecedor);
    }

    @Override
    public Fornecedor atualizaFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @Override
    public void deleteByIdFornecedor(Integer codFornecedor) {
        fornecedorRepository.deleteById(codFornecedor);
    }    
}
