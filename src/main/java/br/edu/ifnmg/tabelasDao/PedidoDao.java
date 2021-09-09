/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tabelasDao;

import br.edu.ifnmg.dao.AbstractDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.edu.ifnmg.tabelas.Categoria;
import br.edu.ifnmg.tabelas.Pedido;
import br.edu.ifnmg.tabelas.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class PedidoDao extends AbstractDao<Pedido, Long>{

    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO pedido VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM pedido WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM pedido";
    }

    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE pedido SET codigo = ?, data_pedido = ?, data_envio = ?, data_recebimento = ?, codigo_cliente = ?, conta_cliente = ?, numero_cartao_credito = ?, codigo_confirmacao = ?, codigo_vendedor = ?, imposto = ?, endereco_fatura = ?, endereco_entrega = ?, codigo_transportadora = ? WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM pedido WHERE codigo = ?";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Pedido pedido) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            // insert
            if (pedido.getId() == null || pedido.getId() == 0) {
                pstmt.setLong(1, pedido.getCodigo());
                pstmt.setString(2, pedido.getData_pedido());
                pstmt.setString(3, pedido.getData_envio());
                pstmt.setString(4, pedido.getData_recebimento());
                pstmt.setLong(5, pedido.getCodigo_cliente());
                pstmt.setString(6, pedido.getConta_cliente());
                pstmt.setLong(7, pedido.getNumero_cartao_credito());
                pstmt.setString(8, pedido.getCodigo_confirmacao());
                pstmt.setLong(9, pedido.getCodigo_vendedor());
                pstmt.setDouble(10, pedido.getImposto());
                pstmt.setLong(11, pedido.getEndereco_fatura());
                pstmt.setLong(12, pedido.getEndereco_entrega());
                pstmt.setLong(13, pedido.getCodigo_transportadora());
                
            } 
            // update
            else {
                pstmt.setLong(1, pedido.getCodigo());
                pstmt.setString(2, pedido.getData_pedido());
                pstmt.setString(3, pedido.getData_envio());
                pstmt.setString(4, pedido.getData_recebimento());
                pstmt.setLong(5, pedido.getCodigo_cliente());
                pstmt.setString(6, pedido.getConta_cliente());
                pstmt.setLong(7, pedido.getNumero_cartao_credito());
                pstmt.setString(8, pedido.getCodigo_confirmacao());
                pstmt.setLong(9, pedido.getCodigo_vendedor());
                pstmt.setDouble(10, pedido.getImposto());
                pstmt.setLong(11, pedido.getEndereco_fatura());
                pstmt.setLong(12, pedido.getEndereco_entrega());
                pstmt.setLong(13, pedido.getCodigo_transportadora());
                pstmt.setLong(14, pedido.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Pedido extrairObjeto(ResultSet resultSet) {
        
        // Cria referência para montagem do usuario
        Pedido pedido = new Pedido();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado do usuario a ser mapeado
        try {
            
            pedido.setCodigo(resultSet.getLong("codigo"));
            pedido.setData_pedido(resultSet.getString("data_pedido"));
            pedido.setData_envio(resultSet.getString("data_envio"));
            pedido.setData_recebimento(resultSet.getString("data_recebimento"));
            pedido.setCodigo_cliente(resultSet.getLong("codigo_cliente"));
            pedido.setConta_cliente(resultSet.getString("conta_cliente"));
            pedido.setNumero_cartao_credito(resultSet.getLong("numero_cartao_credito"));
            pedido.setCodigo_confirmacao(resultSet.getString("codigo_confirmacao"));
            pedido.setCodigo_vendedor(resultSet.getLong("codigo_vendedor"));
            pedido.setImposto(resultSet.getDouble("imposto"));
            pedido.setEndereco_fatura(resultSet.getLong("endereco_fatura"));
            pedido.setEndereco_entrega(resultSet.getLong("endereco_entrega"));
            pedido.setCodigo_transportadora(resultSet.getLong("codigo_transportadora"));
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Devolve o usuario mapeada
        return pedido;
    }

    @Override
    public List<Pedido> extrairObjetos(ResultSet resultSet) {
        // Cria referência para inserção dos usuarios a serem mapeadas
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem do usuario
                Pedido pedido = new Pedido();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado do usuario a ser mapeado
                pedido.setCodigo(resultSet.getLong("codigo"));
                pedido.setData_pedido(resultSet.getString("data_pedido"));
                pedido.setData_envio(resultSet.getString("data_envio"));
                pedido.setData_recebimento(resultSet.getString("data_recebimento"));
                pedido.setCodigo_cliente(resultSet.getLong("codigo_cliente"));
                pedido.setConta_cliente(resultSet.getString("conta_cliente"));
                pedido.setNumero_cartao_credito(resultSet.getLong("numero_cartao_credito"));
                pedido.setCodigo_confirmacao(resultSet.getString("codigo_confirmacao"));
                pedido.setCodigo_vendedor(resultSet.getLong("codigo_vendedor"));
                pedido.setImposto(resultSet.getDouble("imposto"));
                pedido.setEndereco_fatura(resultSet.getLong("endereco_fatura"));
                pedido.setEndereco_entrega(resultSet.getLong("endereco_entrega"));
                pedido.setCodigo_transportadora(resultSet.getLong("codigo_transportadora"));

                // Insere o usuario na lista de usuarios recuperados
                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de usuarios reconstituídas dos registros do banco 
        // de dados
        return pedidos;
    }
    
}
