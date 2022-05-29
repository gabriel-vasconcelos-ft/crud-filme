package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
}
