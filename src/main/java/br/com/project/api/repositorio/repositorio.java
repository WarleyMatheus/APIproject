package br.com.project.api.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.project.api.modelo.Pessoa;

@Repository
public interface repositorio extends CrudRepository<Pessoa, Integer> {

    @SuppressWarnings("null")
    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);

}