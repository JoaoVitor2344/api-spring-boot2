package com.gerenciador.demo.service;

import com.gerenciador.demo.model.Pessoa;
import com.gerenciador.demo.repository.PessoaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Override
    public Pessoa salvaPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> listaPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> getByIdPessoa(Integer codPessoa) {
        return pessoaRepository.findById(codPessoa);
    }

    @Override
    public Pessoa atualizaPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void deleteByIdPessoa(Integer codPessoa) {
        pessoaRepository.deleteById(codPessoa);
    }    
}
