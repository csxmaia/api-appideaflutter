package com.aula.api;

import com.aula.api.database.RepositorioTarefa;
import com.aula.api.entidade.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaREST {

    @Autowired
    private RepositorioTarefa repositorioTarefa;

    @GetMapping
    public List<Tarefa> listar() {
        return repositorioTarefa.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Tarefa tarefa) {
        repositorioTarefa.save(tarefa);
    }

    @PutMapping
    public void alterar(@RequestBody Tarefa tarefa) {
        repositorioTarefa.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repositorioTarefa.deleteById(id);
    }

    @GetMapping("/secao/{secao_id}")
    public void findBySecaoId(@PathVariable Long secao_id) {
        repositorioTarefa.findBySecaoId(secao_id);
    }

}
