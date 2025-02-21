package com.senai.demo.controller;

import com.senai.demo.database.BancoDeProdutos;
import com.senai.demo.model.Produto;

import java.util.List;

public class Controlador {
    private BancoDeProdutos banco = new BancoDeProdutos();

    public Controlador() {
    }


    public List<Produto> listarProdutos() {
        return banco.findAll();
    }

    public void postarProdutos(Produto produto) {
        banco.insert(produto);
    }

    public Boolean atualizarProduto(Produto produto) {
        return banco.update(produto);
    }

    public Boolean deletarProduto(Integer id) {
        return banco.delete(id);
    }
}
