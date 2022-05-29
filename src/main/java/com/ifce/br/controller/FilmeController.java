package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Filme;
import com.ifce.br.service.FilmeService;

@Controller
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@GetMapping("filme/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/filme/salvar")
	public String salvar(Filme filme) {
		filmeService.cadastrarFilme(filme);
		return "sucesso";
	}
	
	@GetMapping("/filme/listar")
	public String listarFilmes() {
		List<Filme> filmes = filmeService.listarFilmes();
		ModelAndView mv = new ModelAndView("listagem-filme");
		
		mv.addObject("listaFilmes", filmes);
		return "mv";
}
	
}
