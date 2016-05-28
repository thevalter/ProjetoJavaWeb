/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Pessoa;
import Bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysingleton.MySingleton;

/**
 *
 * @author Douglas
 */
public class JdbcProdutoDao implements ProdutoDao{
    Connection connection;

    public JdbcProdutoDao() {
        this.connection = MySingleton.getConnection();
    }

    
    
    
    @Override
    public boolean insert(Produto produto) {
       
        try{
           
         String sql = "insert into produto(nome,cpf,login,senha) values(?,?,?,?)";
         
         PreparedStatement prep = connection.prepareStatement(sql);
         prep.setString(1, null);

         prep.executeUpdate();
         return true;


         }catch(SQLException e){
                e.printStackTrace();
                 System.out.println("Oops! Ocorreu um erro inesperado!");
         } catch (Exception ex) {
            Logger.getLogger(JdbcPessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void remove(int id) {
        
         try{

       
         String sql = "delete from pessoa where id_pessoa = ?";
         PreparedStatement prep = connection.prepareStatement(sql);
         prep.setInt(1, id);
         prep.executeUpdate();

         }catch(SQLException e){
                e.printStackTrace();
                 System.out.println("Oops! Ocorreu um erro inesperado!");
         }
        
        
    }

    @Override
    public List<Produto> list() {
        
         List<Produto> produtos = new ArrayList<>();
        
        try{
        
            String sql = "select * from pessoa";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            
            while(rs.next()){
        
                Produto produto = new Produto();
               

                produtos.add(produto);

            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(JdbcPessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    return produtos;
        
    }

    @Override
    public Produto search(int id) {
        
        Produto produto = new Produto();   
     
            try{
        
            String sql = "select * from produto where id_produto = ?";
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setInt(1, id);
            ResultSet rs = prep.executeQuery();
            
            while(rs.next()){
                
                produto.setDescricao(rs.getString("descricao"));
                produto.setCentro(rs.getDouble("centro"));
                produto.setPrecoUnidade(rs.getDouble("centro"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getString("imagem"));
  

            }
            return produto;
        
        } catch (SQLException ex) {
            Logger.getLogger(JdbcPessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    return produto;
        
        
    }

    @Override
    public void edit(Produto produti) {
        
         try{

         String sql = "update produto set nome = ?, cpf = ?, login = ?, senha = ? where id_produto = ?";
         
         PreparedStatement prep = connection.prepareStatement(sql);
         prep.setString(1, null);

         int update = prep.executeUpdate();
         
         if(update <= 0){
             throw new Exception("Nenhum dado foi inserido !!!");
         }else{
             prep.close();
             prep = null;
         }

         }catch(SQLException e){
                e.printStackTrace();
                 System.out.println("Oops! Ocorreu um erro inesperado!");
         } catch (Exception ex) {
            Logger.getLogger(JdbcPessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
