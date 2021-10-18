package com.aula.api;

import com.aula.api.database.RepositorioSecao;
import com.aula.api.entidade.Secao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secao")
public class SecaoREST {

    @Autowired
    private RepositorioSecao repositorioSecao;

    @GetMapping
    public List<Secao> listar() {
        return repositorioSecao.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Secao secao) {
        repositorioSecao.save(secao);
    }

    @PutMapping
    public void alterar(@RequestBody Secao secao) {
        repositorioSecao.save(secao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repositorioSecao.deleteById(id);
    }

}
