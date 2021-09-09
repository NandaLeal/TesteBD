/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelas;

import br.edu.ifnmg.entity.Entidade;

/**
 *
 * @author USER
 */
public class Cliente_Endereco extends Entidade
{   
    private Long codigo_cliente;
    private Long id_endereco;
    private String logradouro;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
     public Cliente_Endereco() {}

    public Cliente_Endereco(Long codigo_cliente, Long id_endereco, String logradouro, Long id) {
        super(id);
        this.codigo_cliente = codigo_cliente;
        this.id_endereco = id_endereco;
        this.logradouro = logradouro;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
   
//</editor-fold>

    
    
    
    
}
