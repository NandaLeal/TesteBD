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
public class Vendedor extends Entidade
{
    private Long codigo;
    private String primeiro_nome;
    private String nome_do_meio;
    private String sobrenome;
    private String senha;
    private String data_nascimento;
    private String data_contratacao;
    private String sexo;
    private Double quota_vendedor;
    private Double bonus;
    private Double comissao;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Vendedor() {
    }

    public Vendedor(Long codigo, String primeiro_nome, String nome_do_meio, String sobrenome, String senha, String data_nascimento, String data_contratacao, String sexo, Double quota_vendedor, Double bonus, Double comissao, Long id) {
        super(id);
        this.codigo = codigo;
        this.primeiro_nome = primeiro_nome;
        this.nome_do_meio = nome_do_meio;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.data_contratacao = data_contratacao;
        this.sexo = sexo;
        this.quota_vendedor = quota_vendedor;
        this.bonus = bonus;
        this.comissao = comissao;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getNome_do_meio() {
        return nome_do_meio;
    }

    public void setNome_do_meio(String nome_do_meio) {
        this.nome_do_meio = nome_do_meio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getQuota_vendedor() {
        return quota_vendedor;
    }

    public void setQuota_vendedor(Double quota_vendedor) {
        this.quota_vendedor = quota_vendedor;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
    
    
//</editor-fold>
    
    
    
}
