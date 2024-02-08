package com.controletarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controletarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
}