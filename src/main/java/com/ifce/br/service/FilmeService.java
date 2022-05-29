package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Filme;
import com.ifce.br.repository.FilmeRepository;

@Service
	public class FilmeService {
	@Autowired
	private FilmeRepository filmeRepo;
	
		public void cadastrarFilme(Filme filme) {
			filmeRepo.save(filme);
		}
		
		public List<Filme> listarFilmes(){
			return filmeRepo.findAll();
		}
	}
