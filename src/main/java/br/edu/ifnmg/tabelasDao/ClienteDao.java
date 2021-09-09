/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelasDao;

import br.edu.ifnmg.bd.ConexaoBd;
import br.edu.ifnmg.dao.AbstractDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import br.edu.ifnmg.tabelas.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ClienteDao extends AbstractDao<Cliente, Long> {

    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO cliente VALUES (?,?,?,?,?,?,?)";
    }
    }

    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM cliente WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoSelectTodos() {
                 return "SELECT * FROM cliente";
    }
    
    public String getDeclaracaoSelectQuantidade() {
         return 
    "SELECT C.primeironome , C.nomedomeio , C.SOBRENOME, COUNT(P.codigo_cliente)" +
    "FROM CLIENTE C, PEDIDO P" +
    "WHERE C.codigo = P.codigo_cliente " +
    "GROUP BY C.primeironome, C.nomedomeio, C.SOBRENOME HAVING COUNT(*) >14" +
    "ORDER BY COUNT(P.codigo_cliente) DESC ";
    }

    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE cliente SET codigo = ?, tratamento = ?, primeironome = ?,  nomedomeio = ?, sobrenome = ?, sufixo = ?, senha = ? WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM cliente WHERE codigo = ?";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Cliente cliente) {
        try {
            // insert
            if (cliente.getId() == null || cliente.getId() == 0) {
                pstmt.setLong(1, cliente.getCodigo());
                pstmt.setString(2, cliente.getTratamento());
                pstmt.setString(3, cliente.getPrimeironome());
                pstmt.setString(4, cliente.getNomedomeio());
                pstmt.setString(5, cliente.getSobrenome());
                pstmt.setString(6, cliente.getSufixo());
                pstmt.setString(7, cliente.getSenha());   
            }
            // update
            else {
                pstmt.setLong(1, cliente.getCodigo());
                pstmt.setString(2, cliente.getTratamento());
                pstmt.setString(3, cliente.getPrimeironome());
                pstmt.setString(4, cliente.getNomedomeio());
                pstmt.setString(5, cliente.getSobrenome());
                pstmt.setString(6, cliente.getSufixo());
                pstmt.setString(7, cliente.getSenha()); 
                pstmt.setLong(8, cliente.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Cliente extrairObjeto(ResultSet resultSet)
    {
         // Cria referência para montagem do usuario
        Cliente cliente = new Cliente();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado do usuario a ser mapeado
        try {
            cliente.setCodigo(resultSet.getLong("codigo"));
            cliente.setTratamento(resultSet.getString("tratamento"));
            cliente.setPrimeironome(resultSet.getString("primeironome"));
            cliente.setNomedomeio(resultSet.getString("nomedomeio"));
            cliente.setSobrenome(resultSet.getString("sobrenome"));
            cliente.setSufixo(resultSet.getString("sufixo"));
            cliente.setSenha(resultSet.getString("senha"));
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        // Devolve o usuario mapeada
        return cliente;
    }

    @Override
    public List<Cliente> extrairObjetos(ResultSet resultSet) {
        // Cria referência para inserção dos usuarios a serem mapeadas
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem do usuario
                Cliente cliente = new Cliente();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado do usuario a ser mapeado
                cliente.setCodigo(resultSet.getLong("codigo"));
                cliente.setTratamento(resultSet.getString("tratamento"));
                cliente.setPrimeironome(resultSet.getString("primeironome"));
                cliente.setNomedomeio(resultSet.getString("nomedomeio"));
                cliente.setSobrenome(resultSet.getString("sobrenome"));
                cliente.setSufixo(resultSet.getString("sufixo"));
                cliente.setSenha(resultSet.getString("senha"));
                // Insere o usuario na lista de usuarios recuperados
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de usuarios reconstituídas dos registros do banco 
        // de dados
        return clientes;
    }
    
    public Cliente autenticar(Cliente cliente) {
        try (PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para validação de vendedor
                        "SELECT * "
                        + "FROM GBDF23953.CLIENTE "
                        + "WHERE codigo = ? "
                        + "AND senha = ?")) {

            // Prepara a declaração com os dados do objeto passado
            pstmt.setLong(1, cliente.getCodigo());
            pstmt.setString(2, cliente.getSenha());

            // Executa o comando SQL
            ResultSet resultSet = pstmt.executeQuery();

            // Se há resultado retornado...
            if (resultSet.next()) {
                // ... implica que email e senha estão corretos 
                // para o usuário e devolve os dados completos deste
                return extrairObjeto(resultSet);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
