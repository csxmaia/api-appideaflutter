package com.aula.api.database;

import com.aula.api.entidade.Secao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioSecao extends JpaRepository<Secao, Long> {

}
