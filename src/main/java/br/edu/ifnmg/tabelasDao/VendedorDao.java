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
import br.edu.ifnmg.tabelas.Vendedor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class VendedorDao extends AbstractDao<Vendedor, Long> {

    @Override
    public String getDeclaracaoInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoSelectPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoSelectTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Vendedor o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendedor extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem do usuario
        Vendedor vendedor = new Vendedor();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado do usuario a ser mapeado
        try {
            vendedor.setCodigo(resultSet.getLong("codigo"));
            vendedor.setPrimeiro_nome(resultSet.getString("primeiro_nome"));
            vendedor.setNome_do_meio(resultSet.getString("nome_do_meio"));
            vendedor.setSobrenome(resultSet.getString("sobrenome"));
            vendedor.setSenha(resultSet.getString("senha"));
            vendedor.setData_nascimento(resultSet.getString("data_nascimento"));
            vendedor.setData_contratacao(resultSet.getString("data_contratacao"));
            vendedor.setSexo(resultSet.getString("sexo"));
            vendedor.setQuota_vendedor(resultSet.getDouble("quota_vendedor"));
            vendedor.setBonus(resultSet.getDouble("bonus"));
            vendedor.setComissao(resultSet.getDouble("comissao"));
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Devolve o usuario mapeada
        return vendedor;
    }

    @Override
    public List<Vendedor> extrairObjetos(ResultSet resultSet) {
        // Cria referência para inserção dos usuarios a serem mapeadas
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem do usuario
                Vendedor vendedor = new Vendedor();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado do usuario a ser mapeado
                vendedor.setCodigo(resultSet.getLong("codigo"));
                vendedor.setPrimeiro_nome(resultSet.getString("primeiro_nome"));
                vendedor.setNome_do_meio(resultSet.getString("nome_do_meio"));
                vendedor.setSobrenome(resultSet.getString("sobrenome"));
                vendedor.setSenha(resultSet.getString("senha"));
                vendedor.setData_nascimento(resultSet.getString("data_nascimento"));
                vendedor.setData_contratacao(resultSet.getString("data_contratacao"));
                vendedor.setSexo(resultSet.getString("sexo"));
                vendedor.setQuota_vendedor(resultSet.getDouble("quota_vendedor"));
                vendedor.setBonus(resultSet.getDouble("bonus"));
                vendedor.setComissao(resultSet.getDouble("comissao"));

                // Insere o usuario na lista de usuarios recuperados
                vendedores.add(vendedor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de usuarios reconstituídas dos registros do banco 
        // de dados
        return vendedores;
    }
    
    
    public Vendedor autenticar(Vendedor vendedor) {
        try (PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para validação de vendedor
                        "SELECT * "
                        + "FROM GBDF23953.VENDEDOR "
                        + "WHERE codigo = ? "
                        + "AND senha = ?")) {

            // Prepara a declaração com os dados do objeto passado
            pstmt.setLong(1, vendedor.getCodigo());
            pstmt.setString(2, vendedor.getSenha());

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
