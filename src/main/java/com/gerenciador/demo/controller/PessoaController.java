package com.gerenciador.demo.controller;

import com.gerenciador.demo.model.Pessoa;
import com.gerenciador.demo.service.PessoaService;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    
    @GetMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> listaPessoas(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.listaPessoas());
    }
    
    @GetMapping("pessoa/{codpessoa}")
    public ResponseEntity<Optional<Pessoa>> getByIdPessoa(@PathVariable Integer codpessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.getByIdPessoa(codpessoa));
    }

    @PostMapping("pessoa")
    public ResponseEntity<Pessoa> salvaPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvaPessoa(pessoa));
    }

    @PutMapping("pessoa")
    public ResponseEntity<Pessoa> atualizaPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.atualizaPessoa(pessoa));
    }
    
    @DeleteMapping("pessoa/{codpessoa}")
    public ResponseEntity<String> deleteByIdPessoa(@PathVariable Integer codpessoa){
        pessoaService.deleteByIdPessoa(codpessoa);
        return ResponseEntity.status(HttpStatus.OK).body("Pessoa removido com sucesso");
    }
}
