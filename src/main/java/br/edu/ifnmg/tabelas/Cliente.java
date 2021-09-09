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
public class Cliente extends Entidade
{
    private Long codigo;
    private String tratamento;
    private String primeironome;
    private String nomedomeio;
    private String sobrenome;
    private String sufixo;
    private String senha;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
     public Cliente() {
    }
    
    public Cliente(Long codigo, String tratamento, String primeironome, String nomedomeio, String sobrenome, String sufixo, String senha, Long id) {
        super(id);
        this.codigo = codigo;
        this.tratamento = tratamento;
        this.primeironome = primeironome;
        this.nomedomeio = nomedomeio;
        this.sobrenome = sobrenome;
        this.sufixo = sufixo;
        this.senha = senha;
    }
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="Geterrs/Seterrs">
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getNomedomeio() {
        return nomedomeio;
    }

    public void setNomedomeio(String nomedomeio) {
        this.nomedomeio = nomedomeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSufixo() {
        return sufixo;
    }

    public void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
//</editor-fold>
    
    
    
}
