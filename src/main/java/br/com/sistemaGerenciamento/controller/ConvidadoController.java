package br.com.sistemaGerenciamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadoController {


    @GetMapping("/convidados")
    public String listaCOnvidados(){
        return "Lista de convidados";
    }
}
