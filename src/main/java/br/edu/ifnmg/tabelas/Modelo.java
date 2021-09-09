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
public class Modelo extends Entidade
{
     private Long codigo;
    private String nome;
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Modelo() {
    }

    public Modelo(Long codigo, String nome, Long id) {
        super(id);
        this.codigo = codigo;
        this.nome = nome;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
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
    
//</editor-fold>
}
