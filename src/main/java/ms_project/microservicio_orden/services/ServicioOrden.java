package ms_project.microservicio_orden.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms_project.microservicio_orden.entities.Orden;
import ms_project.microservicio_orden.repositories.repositorioOrden;

@Service
public class ServicioOrden {
    repositorioOrden repositorioOrden;

    @Autowired
    ServicioOrden(repositorioOrden repositorioOrden){
        this.repositorioOrden = repositorioOrden;
    }

    public Orden getOrden(Long id){
        Optional<Orden>ordenOpt = repositorioOrden.findById(id);
        if (ordenOpt.isPresent()) {
            Orden orden = ordenOpt.get();
            return orden;
        }
        else{
            return null;
        }
    }

    public Orden save(Orden ordenn){
        return repositorioOrden.save(ordenn);
    }

    public void delete(Long id){
        Optional<Orden> ordenOpt = repositorioOrden.findById(id);
        ordenOpt.ifPresent(orden -> {
            orden.setEliminado(true);
            repositorioOrden.save(orden);
        });
    }

    public Orden update(Orden ordenn){
        Optional<Orden> ordenOptional = repositorioOrden.findById(ordenn.getId());
    
        if (ordenOptional.isPresent()) {
            Orden ordenDB = ordenOptional.get();
            
            if (ordenDB.getEstado() == 1) {
                return null;
            }
            else{
                if (ordenn.getItems() != null) {
                    ordenDB.setItems(ordenn.getItems());
                }
            }
            ordenDB = repositorioOrden.save(ordenDB);
            return ordenDB;
        } else {
            return null;
        }
    }
}
