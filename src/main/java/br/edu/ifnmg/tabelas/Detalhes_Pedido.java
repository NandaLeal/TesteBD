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
public class Detalhes_Pedido extends Entidade
{
    private Long codigo_pedido;
    private String codigo_produto;
    private Long quantidade;
    private Double preco_unitario;
    private Double desconto;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Detalhes_Pedido() {
    }

    public Detalhes_Pedido(Long codigo_pedido, String codigo_produto, Long quantidade, Double preco_unitario, Double desconto, Long id) {
        super(id);
        this.codigo_pedido = codigo_pedido;
        this.codigo_produto = codigo_produto;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.desconto = desconto;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(Long codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
     
//</editor-fold>
      
}
