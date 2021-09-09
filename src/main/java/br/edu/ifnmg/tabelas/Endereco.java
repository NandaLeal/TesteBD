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
public class Endereco extends Entidade
{
    private Long id_endereco;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;
    private String codigopostal;
    //<editor-fold defaultstate="collapsed" desc="Construtores">
     public Endereco() {
    }

    
    public Endereco(Long id_endereco, String logradouro, String complemento, String cidade, String estado, String pais, String codigopostal, Long id) {
        super(id);
        this.id_endereco = id_endereco;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.codigopostal = codigopostal;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
//</editor-fold>
    
   
    
    
}
