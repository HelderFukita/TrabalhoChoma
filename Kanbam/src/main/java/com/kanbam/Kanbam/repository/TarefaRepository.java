package com.kanbam.Kanbam.repository;

import com.kanbam.Kanbam.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
    List<Tarefa> findByOrderByPrioridadeAsc();
}
