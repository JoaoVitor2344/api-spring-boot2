package com.gerenciador.demo.service;

import com.gerenciador.demo.model.Pessoa;
import java.util.List;
import java.util.Optional;

public interface PessoaService {
    public Pessoa salvaPessoa(Pessoa pessoa);
    
    public List<Pessoa> listaPessoas();
    
    public Optional<Pessoa> getByIdPessoa(Integer codPessoa);
    
    public Pessoa atualizaPessoa(Pessoa Pessoa);
    
    public void deleteByIdPessoa(Integer codPessoa);    
}
