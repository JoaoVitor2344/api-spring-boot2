package com.gerenciador.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "produto")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_produto")
    private Integer cod_Produto;
    
    @ManyToOne
    @JoinColumn(name = "cod_fornecedor")
    private Fornecedor fornecedor;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "quantidade")
    private Integer quantidade;
    
    public Produto() {
    }

    public Produto(Integer cod_Produto, Fornecedor fornecedor, String nome, String tipo, Integer quantidade) {
        this.cod_Produto = cod_Produto;
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public Integer getCod_Produto() {
        return cod_Produto;
    }

    public void setCod_Produto(Integer cod_Produto) {
        this.cod_Produto = cod_Produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
