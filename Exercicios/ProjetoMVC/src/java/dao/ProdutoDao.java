/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonas
 */
public class ProdutoDao {
    
    private static ArrayList<Produto> lista = null;//cria a coleção ArrayList para produto//funciona como banco de dados
    
    public ProdutoDao() {
            //enquanto a aplicação estiver rodando a lista estará lá
    lista = new ArrayList<Produto>();
    }
    
    public void adicionarProduto(Produto p){
        lista.add(p);
    }
    
    public void removerProduto(Produto p){
        lista.remove(p);
    }
    
    public Produto consultarProduto(int codigo){
        for(Produto p: lista){
            if(p.getCodigo() == codigo)
                return p;
        }
        return null; 
    }
    
    public void alteraProduto(Produto p){
        Produto prod = consultarProduto(p.getCodigo());
        int id = lista.indexOf(prod);
        lista.set(id, p);
        /*
        if(prod != null){ //considerar que o cara sempre vai ser buscado
            lista.remove(prod);
            lista.add(p);
        } 
        */
    }
    
    public ArrayList<Produto> todosProdutos(){
        return lista;
    }
}
