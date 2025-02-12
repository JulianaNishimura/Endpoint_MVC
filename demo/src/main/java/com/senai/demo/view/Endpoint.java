package com.senai.demo.view;

import com.senai.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class Endpoint {

    public Produto p1;

    @GetMapping
    public String getInformations(){
        if(p1 == null){
            return "Produto não cadastrado";
        }
        return p1.toString();
    }

    @PostMapping
    public String postInformations(@RequestBody Produto produto){
        p1 = produto;
        return "Produto cadastrado! " + p1.toString();
    }

    @PutMapping
    public String putInformations(@RequestBody Produto produto){
        if(p1 == null){
            return null;
        }
        p1.setIdProduto(produto.getIdProduto());
        p1.setDescricao(produto.getDescricao());
        p1.setNomeProduto(produto.getNomeProduto());
        p1.setPreco(produto.getPreco());
        p1.setQuantidade(produto.getQuantidade());
        p1.setPontoDeVenda(produto.getPontoDeVenda());
        return "Produto atualizado com sucesso! " + p1.toString();
    }

    @DeleteMapping
    public String deleteInformations(){
        if (p1 == null){
            return "O produto não foi encontrado.";
        }
        p1 = null;
        return "Deletado com sucesso!";
    }

}
