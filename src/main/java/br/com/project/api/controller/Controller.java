package br.com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.api.modelo.Pessoa;
import br.com.project.api.repositorio.repositorio;

@RestController //Define a classe como uma classe de controle
public class Controller {
    
    @Autowired
    private repositorio acao;
    
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @GetMapping("/api")
    public List<Pessoa> selecionar(){
        return acao.findALL();
    }

    @GetMapping("") //responsável por criar as rotas
    public String message(){
        return "Hello World!";
    }

    @GetMapping("/welcome")
    public String boasVindas(){
        return "Seja bem vindo(a)";
    }

    @GetMapping("/welcome/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
       return p;
    }
}
