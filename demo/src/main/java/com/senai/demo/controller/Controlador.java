package com.senai.demo.controller;

import com.senai.demo.database.BancoDeProdutos;

public class Controlador {
    private BancoDeProdutos banco = new BancoDeProdutos();

    public Controlador() {
    }

    public Controlador(BancoDeProdutos banco) {
        this.banco = banco;
    }

    public BancoDeProdutos getBanco() {
        return banco;
    }

    public void setBanco(BancoDeProdutos banco) {
        this.banco = banco;
    }

}
