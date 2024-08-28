package edu.ifmt.adocao.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.adocao.model.StatusTitulo;
import edu.ifmt.adocao.model.Titulo;
import edu.ifmt.adocao.repository.Titulos;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired
    private Titulos titulos;

    @ModelAttribute("todosStatusTitulo")
    public List<StatusTitulo> todosStatusTitulos() {
        return Arrays.asList(StatusTitulo.values());
    }
    
    @GetMapping
    public ModelAndView pesquisar() {
        List<Titulo> todosTitulos = titulos.findAll();
        ModelAndView mv = new ModelAndView("PesquisaTitulo");
        mv.addObject("titulos", todosTitulos);
        return mv;
    }

    @GetMapping("/novo")
    public ModelAndView novo(Titulo titulo) {

        ModelAndView mv = new ModelAndView("CadastroTitulo");
       // mv.addObject("todosStatusTitulo", StatusTitulo.values());

        return mv;
    }

    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView salvar(Titulo titulo) {

        titulos.save(titulo);
        ModelAndView mv = new ModelAndView("CadastroTitulo");
        mv.addObject("mensagem", "Foi salvo com sucesso!");

        return mv;
    }
}

