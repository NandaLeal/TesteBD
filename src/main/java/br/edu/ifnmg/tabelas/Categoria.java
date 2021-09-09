/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelas;

import br.edu.ifnmg.entity.Entidade;

/**
 *
 * @author Filip
 */
public class Categoria extends Entidade{
    private Long codigo;
    private String nome;
    private Long categoria_principal;

    public Categoria() {
        
    }
    
    
    /**
     * 
     * @param codigo
     * @param nome
     * @param categoria_principal 
     */
    public Categoria(Long id, Long codigo, String nome, Long categoria_principal) {
        super(id);
        this.codigo = codigo;
        this.nome = nome;
        this.categoria_principal = categoria_principal;
    }

    

        
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCategoria_principal() {
        return categoria_principal;
    }

    public void setCategoria_principal(Long categoria_principal) {
        this.categoria_principal = categoria_principal;
    }
    
    
}
