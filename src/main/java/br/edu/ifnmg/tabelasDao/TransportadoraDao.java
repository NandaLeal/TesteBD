/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelasDao;

import br.edu.ifnmg.dao.AbstractDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import br.edu.ifnmg.tabelas.Transportadora;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class TransportadoraDao extends AbstractDao<Transportadora, Long>{

    @Override
    public String getDeclaracaoInsert() 
    {
         return "INSERT INTO transportadora VALUES (?,?,?,?)";
    }

    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM transportadora WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoSelectTodos() {
         return "SELECT * FROM transportadora";
    }

    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE transportadora SET codigo = ?, nome = ?, taxa_base = ?, taxa_envio = ? WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM transportadora WHERE codigo = ?";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Transportadora transportadora) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            // insert
            if (transportadora.getId() == null || transportadora.getId() == 0) {
                pstmt.setLong(1, transportadora.getCodigo());
                pstmt.setString(2, transportadora.getNome());
                pstmt.setLong(3, transportadora.getTaxa_base());
                pstmt.setLong(4, transportadora.getTaxa_envio()); 
            } 
            // update
            else {
                pstmt.setLong(1, transportadora.getCodigo());
                pstmt.setString(2, transportadora.getNome());
                pstmt.setLong(3, transportadora.getTaxa_base());
                pstmt.setLong(4, transportadora.getTaxa_envio()); 
                pstmt.setLong(5, transportadora.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransportadoraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Transportadora extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem do usuario
        Transportadora transportadora = new Transportadora();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado do usuario a ser mapeado
        try {
            
            transportadora.setCodigo(resultSet.getLong("codigo"));
            transportadora.setNome(resultSet.getString("nome"));
            transportadora.setTaxa_base(resultSet.getLong("taxa_base"));
            transportadora.setTaxa_envio(resultSet.getLong("taxa_envio")); 
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        // Devolve o usuario mapeada
        return transportadora;
    }

    @Override
    public List<Transportadora> extrairObjetos(ResultSet resultSet) {
        // Cria referência para inserção dos usuarios a serem mapeadas
        ArrayList<Transportadora> transportadoras = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem do usuario
                Transportadora  transportadora  = new Transportadora ();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado do usuario a ser mapeado
                transportadora.setCodigo(resultSet.getLong("codigo"));
                transportadora .setNome(resultSet.getString("nome"));
                transportadora .setTaxa_base(resultSet.getLong("taxa_base"));
                transportadora .setTaxa_envio(resultSet.getLong("taxa_envio"));
                // Insere o usuario na lista de usuarios recuperados
                transportadoras.add(transportadora);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransportadoraDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de usuarios reconstituídas dos registros do banco 
        // de dados
        return transportadoras;
    }
    }
    

