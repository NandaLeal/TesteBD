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
public class Produto extends Entidade
{
    private String codigo;
    private String nome;
    private String cor;
    private Double custo_producao;
    private Double preco;
    private String tamanho;
    private Double peso;
    private Long codigo_modelo;
    private Long codigo_categoria;
    private String data_inicio_venda;
    private String data_fim_venda;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Produto() {
    }

    public Produto(String codigo, String nome, String cor, Double custo_producao, Double preco, String tamanho, Double peso, Long codigo_modelo, Long codigo_mategoria, String data_inicio_venda, String data_fim_venda, Long id) {
        super(id);
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
        this.custo_producao = custo_producao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.peso = peso;
        this.codigo_modelo = codigo_modelo;
        this.codigo_categoria = codigo_mategoria;
        this.data_inicio_venda = data_inicio_venda;
        this.data_fim_venda = data_fim_venda;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getCusto_producao() {
        return custo_producao;
    }

    public void setCusto_producao(Double custo_producao) {
        this.custo_producao = custo_producao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Long getCodigo_modelo() {
        return codigo_modelo;
    }

    public void setCodigo_modelo(Long codigo_modelo) {
        this.codigo_modelo = codigo_modelo;
    }

    public Long getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(Long codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getData_inicio_venda() {
        return data_inicio_venda;
    }

    public void setData_inicio_venda(String data_inicio_venda) {
        this.data_inicio_venda = data_inicio_venda;
    }

    public String getData_fim_venda() {
        return data_fim_venda;
    }

    public void setData_fim_venda(String data_fim_venda) {
        this.data_fim_venda = data_fim_venda;
    }
    
    
//</editor-fold>
    
    
    
}
