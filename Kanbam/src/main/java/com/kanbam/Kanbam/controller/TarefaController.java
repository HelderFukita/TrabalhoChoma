package com.kanbam.Kanbam.controller;

import com.kanbam.Kanbam.model.Status;
import com.kanbam.Kanbam.model.Tarefa;
import com.kanbam.Kanbam.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> raiz(){
        return tarefaService.listaTodos();
    }
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.salvarTarefa(tarefa);
    }
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Integer id, @RequestBody Tarefa tarefa) {
        return tarefaService.atualizarTarefa(id, tarefa);
    }
    @PutMapping("/{id}/move")
    public Tarefa moverTarefa(@PathVariable Integer id) {
        return tarefaService.moverTarefa(id);
    }
    @DeleteMapping("/{id}")
    public void excluirTarefa(@PathVariable Integer id) {
        tarefaService.excluirTarefa(id);
    }
    @GetMapping("/atrasados")
    public List<Tarefa> listarAtrasadas() {
        return tarefaService.listarAtrasados();
    }

}
