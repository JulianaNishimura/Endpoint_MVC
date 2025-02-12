package com.senai.demo.database;

import com.senai.demo.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoDeProdutos {
    private List<Produto> produtos;

    public BancoDeProdutos(){
        this.produtos = new ArrayList<>();
    }

    public void insert(Produto p){
        produtos.add(p);
    }

    public Produto findOne(int id){
        for (Produto p : produtos){
            if (p.getIdProduto() == id){
                return p;
            }
        }
        return null;
    }

    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    public boolean update(Produto p){
        for(int i = 0; i < produtos.size();i++){
            if(produtos.get(i).getIdProduto() == p.getIdProduto()){
                produtos.set(i,p);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id){
        return produtos.removeIf(p -> p.getIdProduto() == id);
    }
}
