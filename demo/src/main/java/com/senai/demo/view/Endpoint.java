package com.senai.demo.view;

import com.senai.demo.controller.Controlador;
import com.senai.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class Endpoint {

    public Produto p1;
    public Controlador c1 = new Controlador();

    @GetMapping
    public List<Produto> getInformations(){
        return c1.listarProdutos();
    }

    @PostMapping
    public String postInformations(@RequestBody Produto produto){
        c1.postarProdutos(produto);
        return "Sucesso";
    }

    @PutMapping
    public String putInformations(@RequestBody Produto produto){
        c1.atualizarProduto(produto);
        return "Produto atualizado com sucesso!";
    }

    @DeleteMapping
    public String deleteInformations(@RequestBody int id){
        c1.deletarProduto(id);
        return "Deletado com sucesso!";
    }

//    @DeleteMapping
//    public String deleteInformations(@RequestBody Produto produto){
//        c1.deletarProduto(produto.getId());
//        return "Deletado com sucesso!";
//    }

}
