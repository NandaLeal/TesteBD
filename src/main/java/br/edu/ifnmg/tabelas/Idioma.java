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
public class Idioma extends Entidade
{
    private String sigla;
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Idioma() {
    }

    
    public Idioma(String sigla, String nome, Long id) {
        super(id);
        this.sigla = sigla;
        this.nome = nome;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//</editor-fold>

}
