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

/**
 *
 * @author Filip
 */
public class CategoriaDao extends AbstractDao<Categoria, Long>{

    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO categoria VALUES (?,?,?)";
    }

    @Override
    public String getDeclaracaoSelectPorId() {
         return "SELECT * FROM categoria WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM categoria";
    }

    @Override
    public String getDeclaracaoUpdate() {
         return "UPDATE categoria SET codigo = ?, nome = ?, categoria_principal = ? WHERE codigo = ?";
    }

    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM categoria WHERE codigo = ?";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Categoria categoria) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            // insert
//            if (categoria.getId() == null || categoria.getId() == 0) {
                pstmt.setLong(1, categoria.getCodigo());
                pstmt.setString(2, categoria.getNome());
                pstmt.setLong(3, categoria.getCategoria_principal());
                
                System.out.println(">> "+categoria.getCodigo()+"\n"
                        +">> "+categoria.getNome()+"\n"
                        +">> "+categoria.getCategoria_principal());
//            } 
//            // update
//            else {
//                pstmt.setLong(1, categoria.getCodigo());
//                pstmt.setString(2, categoria.getNome());
//                pstmt.setLong(3, categoria.getCategoria_principal());
//            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Categoria extrairObjeto(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> extrairObjetos(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
