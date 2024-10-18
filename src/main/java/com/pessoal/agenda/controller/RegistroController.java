package com.pessoal.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pessoal.agenda.model.Registro;
import com.pessoal.agenda.repository.RegistroRepository;
import com.pessoal.agenda.service.RegistroService;

@Controller
public class RegistroController {

    @Autowired
    private RegistroService registroService;
    @GetMapping("/")
    public String registros() {
        return "/registro";
    }
    @GetMapping("/registroForm")
    public String novoRegistro(Model model) {
    Registro registro = new Registro();
    model.addAttribute("novoRegistro", registro);
        return "/registroForm";
    }
    @PostMapping("/gravar")
    public String salvarRegistro(@ModelAttribute("novoRegistro") Registro registro) {
        registroService.criarRegistro(registro);
            return "redirect:/";
        }
}
