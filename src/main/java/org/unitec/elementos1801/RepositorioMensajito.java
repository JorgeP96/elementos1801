package org.unitec.elementos1801;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface  RepositorioMensajito extends CrudRepository<Mensaje, Integer>{
    List<Mensaje> findByTitulo(String titulo);
}