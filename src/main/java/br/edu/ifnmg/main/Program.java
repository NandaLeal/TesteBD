/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.main;

import br.edu.ifnmg.bd.ConexaoBd;
import br.edu.ifnmg.entity.Entidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import br.edu.ifnmg.tabelas.Categoria;
import br.edu.ifnmg.tabelas.Pedido;
import br.edu.ifnmg.tabelasDao.CategoriaDao;
import br.edu.ifnmg.tabelasDao.PedidoDao;

/**
 *
 * @author Filip
 */
public abstract class Program {
    
    public static void main(String[] args) {
        
        /*
        
                "to_timestamp('01/07/05 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF')", 
                "to_timestamp('08/07/05 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF')",
                "to_timestamp('13/07/05 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF')",
        
        
        */
        
        
        
//        Pedido pedido;
//        pedido = new Pedido(
//                99113L, 
//                "11/07/05",
//                "11/07/05",
//                "11/07/05",
//                3732L,
//                "10-4030-027324",
//                13803,
//                "619329Vi71549",
//                275L,
//                1.8999,
//                26892L,
//                26892L,
//                3L, 
//                99113L);
//        PedidoDao pedidoDao = new PedidoDao();
//        pedidoDao.salvar(pedido);13803L
        
        Pedido pedido = new Pedido();
        pedido.setCodigo(99112L);
        pedido.setId(99113L);
//        
        PedidoDao pedidoDao = new PedidoDao();
        pedido = pedidoDao.localizarPorId(pedido.getId());
        
        System.out.println("Objeto buscado: "+pedido.getCodigo()+" "+pedido.getEndereco_fatura()+"...");
        
        
        
        
        
          // insere em categoria
//        Categoria categoria = new Categoria();
//        categoria.setCodigo(43L);
//        categoria.setNome("ssssssssssssss");
//        categoria.setCategoria_principal(5L);


        // remove de categoria
//        Categoria categoria = new Categoria();
//        categoria.setCodigo(43L);
//        categoria.setId(categoria.getCodigo());
//        
//        CategoriaDao categoriaDao = new CategoriaDao();
//        if(categoriaDao.excluir(categoria) == false){
//            System.out.println("nao apagou");
//        }
//        else{
//            System.out.println("remoção concluida");
//        }
        
            
        
    }
        
    public abstract String getDeclaracaoInicial();
}
