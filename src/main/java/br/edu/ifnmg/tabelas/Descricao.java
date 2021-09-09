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
public class Descricao extends Entidade
{
     private Long codigo;
    private String descricao;
    private Long codigo_modelo;
    private String sigla_idioma;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
      public Descricao() {
    }

    public Descricao(Long codigo, String descricao, Long codigo_modelo, String sigla_idioma, Long id) {
        super(id);
        this.codigo = codigo;
        this.descricao = descricao;
        this.codigo_modelo = codigo_modelo;
        this.sigla_idioma = sigla_idioma;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getteres/Setters">
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getCodigo_modelo() {
        return codigo_modelo;
    }

    public void setCodigo_modelo(Long codigo_modelo) {
        this.codigo_modelo = codigo_modelo;
    }

    public String getSigla_idioma() {
        return sigla_idioma;
    }

    public void setSigla_idioma(String sigla_idioma) {
        this.sigla_idioma = sigla_idioma;
    }
  
//</editor-fold>
    
}
