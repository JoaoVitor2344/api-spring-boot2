package com.gerenciador.demo.controller;

import com.gerenciador.demo.model.Fornecedor;
import com.gerenciador.demo.service.FornecedorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorServices;
    
    @GetMapping("/fornecedores")
    public ResponseEntity<List<Fornecedor>> listaFornecedores(){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorServices.listaFornecedores());
    }
    
    @GetMapping("fornecedor/{codfornecedor}")
    public ResponseEntity<Optional<Fornecedor>> getByIdFornecedor(@PathVariable Integer codfornecedor){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorServices.getByIdFornecedor(codfornecedor));
    }

    @PostMapping("fornecedor")
    public ResponseEntity<Fornecedor> salvaFornecedor(@RequestBody Fornecedor fornecedor){
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorServices.salvaFornecedor(fornecedor));
    }

    @PutMapping("fornecedor")
    public ResponseEntity<Fornecedor> atualizaFornecedor(@RequestBody Fornecedor fornecedor){
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorServices.atualizaFornecedor(fornecedor));
    }
    
    @DeleteMapping("fornecedor/{codfornecedor}")
    public ResponseEntity<String> deleteByIdFornecedor(@PathVariable Integer codfornecedor){
        fornecedorServices.deleteByIdFornecedor(codfornecedor);
        return ResponseEntity.status(HttpStatus.OK).body("Fornecedor removido com sucesso");
    }
}
