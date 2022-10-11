package com.gerenciador.demo.service;

import com.gerenciador.demo.model.Fornecedor;
import java.util.List;
import java.util.Optional;

public interface FornecedorService {
    public Fornecedor salvaFornecedor(Fornecedor fornecedor);
    
    public List<Fornecedor> listaFornecedores();
    
    public Optional<Fornecedor> getByIdFornecedor(Integer codFornecedor);
    
    public Fornecedor atualizaFornecedor(Fornecedor fornecedor);
    
    public void deleteByIdFornecedor(Integer codFornecedor);    
}
