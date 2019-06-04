package br.com.sistemaGerenciamento.controller;

import br.com.sistemaGerenciamento.model.Convidado;
import br.com.sistemaGerenciamento.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/convidados")
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository convidadoRepository;


    @GetMapping
    public ModelAndView lista() {

        ModelAndView modelAndView = new ModelAndView("listaConvidados.html");

        modelAndView.addObject("convidados", convidadoRepository.findAll());

        modelAndView.addObject(new Convidado());
        return modelAndView;
    }


    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidadoRepository.save(convidado);

        return "redirect:/convidados";
    }


}
