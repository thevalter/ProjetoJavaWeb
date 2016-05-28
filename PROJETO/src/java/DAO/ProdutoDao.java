/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Produto;
import java.util.List;

/**
 *
 * @author Douglas
 */
public interface ProdutoDao {
   
    public boolean insert(Produto produto);
    public void remove (int id);
    public List<Produto> list();
    public Produto search(int id);
    public void edit(Produto produti);
}
