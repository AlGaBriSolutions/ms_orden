package ms_project.microservicio_orden.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ms_project.microservicio_orden.entities.Orden;

@Repository
public interface repositorioOrden extends CrudRepository<Orden, Long>{
    
}
