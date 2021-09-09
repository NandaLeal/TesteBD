/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelas;

import br.edu.ifnmg.entity.Entidade;
import java.math.BigDecimal;

/**
 *
 * @author Filip
 */
public class Pedido extends Entidade{
    
    private Long codigo;
    private String data_pedido;
    private String data_envio;
    private String data_recebimento;
    private Long codigo_cliente;
    private String conta_cliente;
    private Long numero_cartao_credito;
    private String codigo_confirmacao;
    private Long codigo_vendedor;
    private Double imposto;
    private Long endereco_fatura;
    private Long endereco_entrega;
    private Long codigo_transportadora;
  
    
    public Pedido() {
              
    }
    
    /**
     * 
     * @param codigo 
     * @param data_pedido
     * @param data_envio
     * @param data_recebeimento
     * @param codigo_cliente
     * @param conta_cliente
     * @param numero_cartao_credito
     * @param codigo_confirmacao
     * @param codigo_vendedor
     * @param imposto
     * @param endereco_fatura
     * @param endereco_entrega
     * @param codigo_transportadora
     * @param id 
     */
    public Pedido(Long codigo, String data_pedido, String data_envio, String data_recebeimento, Long codigo_cliente, String conta_cliente, Long numero_cartao_credito, String codigo_confirmacao, Long codigo_vendedor, Double imposto, Long endereco_fatura, Long endereco_entrega, Long codigo_transportadora, Long id) {
        super(id);
        this.codigo = codigo;
        this.data_pedido = data_pedido;
        this.data_envio = data_envio;
        this.data_recebimento = data_recebeimento;
        this.codigo_cliente = codigo_cliente;
        this.conta_cliente = conta_cliente;
        this.numero_cartao_credito = numero_cartao_credito;
        this.codigo_confirmacao = codigo_confirmacao;
        this.codigo_vendedor = codigo_vendedor;
        this.imposto = imposto;
        this.endereco_fatura = endereco_fatura;
        this.endereco_entrega = endereco_entrega;
        this.codigo_transportadora = codigo_transportadora;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public String getData_envio() {
        return data_envio;
    }

    public void setData_envio(String data_envio) {
        this.data_envio = data_envio;
    }

    public String getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(String data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getConta_cliente() {
        return conta_cliente;
    }

    public void setConta_cliente(String conta_cliente) {
        this.conta_cliente = conta_cliente;
    }

    public Long getNumero_cartao_credito() {
        return numero_cartao_credito;
    }

    public void setNumero_cartao_credito(Long numero_cartao_credito) {
        this.numero_cartao_credito = numero_cartao_credito;
    }

    public String getCodigo_confirmacao() {
        return codigo_confirmacao;
    }

    public void setCodigo_confirmacao(String codigo_confirmacao) {
        this.codigo_confirmacao = codigo_confirmacao;
    }

    public Long getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(Long codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Long getEndereco_fatura() {
        return endereco_fatura;
    }

    public void setEndereco_fatura(Long endereco_fatura) {
        this.endereco_fatura = endereco_fatura;
    }

    public Long getEndereco_entrega() {
        return endereco_entrega;
    }

    public void setEndereco_entrega(Long endereco_entrega) {
        this.endereco_entrega = endereco_entrega;
    }

    public Long getCodigo_transportadora() {
        return codigo_transportadora;
    }

    public void setCodigo_transportadora(Long codigo_transportadora) {
        this.codigo_transportadora = codigo_transportadora;
    }
    
    
    
    
}
