/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip
 */
public class ConexaoBd {
 
    
    
    
    /**
     * URL de conexão com o banco de dados
     * (protocolo/sgbd/ip/porta/banco/parâmetros).
     */
    public static final String URL;

    /**
     * Retém a conexão estabelecida com o banco de dados durante a operação do
     * sistema.
     */
    private static Connection conexao;

    /**
     * Usuário para acesso ao banco de dados.
     */
    private static String usuario;

    /**
     * Senha para acesso ao banco de dados.
     */
    private static String senha;
    
    private static final String ORACLEDRIVER;
    /**
     * Inicialização de valores estáticos.
     */
    static {
        URL = "jdbc:oracle:thin:@grad.icmc.usp.br:15215:orcl";
//                + "?useUnicode=true"
//                + "&useJDBCCompliantTimezoneShift=true"
//                + "&serverTimezone=UTC"
//                + "&autoReconnect=true";
        usuario = "GBDf23953";
        senha = "voupassar";
        ORACLEDRIVER = "oracle.jdbc.driver.OracleDriver";
    }

    //<editor-fold defaultstate="collapsed" desc="Construtor privado">
    /**
     * Construtor privado para forçar acesso à conexão pelo membro estático
     * <code>getConexao()</code> sem que sejam gerados novos objetos
     * "ConexaoBd".
     */
    private ConexaoBd() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ConexaoBd.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ConexaoBd.senha = senha;
    }
    //</editor-fold>

    /**
     * Estabele e gera a retenção da conexão com o banco de dados.
     *
     * @return Conexão com o banco de dados.
     */
    public static Connection getConexao() {

        // Se não há uma conexão estabelecida...
        if (conexao == null) {
            // ... tenta ...
            try {
                 //Definindo que o JDBC saiba que é o driver da Oracle que deve ser usado na conexão!
                Class.forName(ORACLEDRIVER);
                 System.out.println("Configuração do Driver Oracle bem-sucedida");
                
                // ... estabelecer e reter a conexão a partir da URL,                 
                // do usuário e da senha fornecidos
                conexao = DriverManager.getConnection(URL, usuario, senha);
                System.out.println(">> Nova conexão estabelecida com o banco de dados");
                System.out.println("Conexão bem-sucedida");
                //capturando exceção caso o driver do oracle tenha algum problema!!!
                } 
            catch (ClassNotFoundException cnfex) {
                      System.out.println("Class not found");
                    //capturando as mensagens de erro do retorno do Oracle!! 
            } 
            catch (SQLException ex) {
                // TODO Rever procedimento e encerrar o programa em caso de falha
                // Caso ocorra alguma falha, registra falha
                Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Devolve a conexão estabelecida
        return conexao;

    }
}

