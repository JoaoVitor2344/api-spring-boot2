package com.gerenciador.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
public class Fornecedor implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_fornecedor")
    private Integer cod_fornecedor;
    
    @OneToOne
    @JoinColumn(name = "cod_pessoa")
    private Pessoa pessoa;
    
    @Column(name = "cnpj")
    private String cnpj;
    
    public Fornecedor() {
    }

    public Fornecedor(Integer cod_fornecedor, Pessoa pessoa, String cnpj) {
        this.cod_fornecedor = cod_fornecedor;
        this.pessoa = pessoa;
        this.cnpj = cnpj;
    }

    public Integer getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(Integer cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
