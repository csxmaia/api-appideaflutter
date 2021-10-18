package com.aula.api.database;

import com.aula.api.entidade.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

    Tarefa findBySecaoId(Long secao_id);

}
