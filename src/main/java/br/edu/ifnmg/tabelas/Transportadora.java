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
public class Transportadora  extends Entidade
{
    private Long codigo;
    private String nome;
    private Long taxa_base;
    private Long taxa_envio;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Transportadora() {}
    
    public Transportadora(Long codigo, String nome, Long taxa_base, Long taxa_envio, Long id) {
        super(id);
        this.codigo = codigo;
        this.nome = nome;
        this.taxa_base = taxa_base;
        this.taxa_envio = taxa_envio;
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

    public Long getTaxa_base() {
        return taxa_base;
    }

    public void setTaxa_base(Long taxa_base) {
        this.taxa_base = taxa_base;
    }

    public Long getTaxa_envio() {
        return taxa_envio;
    }

    public void setTaxa_envio(Long taxa_envio) {
        this.taxa_envio = taxa_envio;
    }

//</editor-fold>
    
    
    @Override
    public String toString() {
        return codigo.toString();
    }
    
    
}
