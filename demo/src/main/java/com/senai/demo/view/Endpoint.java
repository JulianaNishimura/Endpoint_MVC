package com.senai.demo.view;

import com.senai.demo.controller.Controlador;
import com.senai.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class Endpoint {

    public Produto p1;
    public Controlador c1 = new Controlador();

    @GetMapping
    public String getInformations(){
        if(p1 == null){
            return "Produtos não cadastrado";
        }

        return c1.getBanco().findAll() + "Produtos encontrados";
    }

    @PostMapping
    public String postInformations(@RequestBody Produto produto){
        p1 = produto;
        c1.getBanco().insert(p1);
        return c1.getBanco().findOne(p1.getIdProduto()) + "Produto cadastrado!";
    }

    @PutMapping
    public String putInformations(@RequestBody Produto produto){
        if(p1 == null){
            return null;
        }
        p1.setDescricao(produto.getDescricao());
        p1.setNomeProduto(produto.getNomeProduto());
        p1.setPreco(produto.getPreco());
        p1.setQuantidade(produto.getQuantidade());
        p1.setPontoDeVenda(produto.getPontoDeVenda());

        c1.getBanco().update(p1);
        return c1.getBanco().findOne(p1.getIdProduto()) + "Produto atualizado com sucesso!";
    }

    @DeleteMapping
    public String deleteInformations(@RequestBody int id){
        if (p1 == null){
            return "O produto não foi encontrado.";
        }
        p1.setIdProduto(id);
        c1.getBanco().delete(p1.getIdProduto());
        return "Deletado com sucesso!";
    }

}
