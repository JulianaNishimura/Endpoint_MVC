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

    public void atualizarProduto(Produto produto) {
        banco.update(produto);
    }

    public void deletarProduto(int id) {
        banco.delete(id);
    }
}
