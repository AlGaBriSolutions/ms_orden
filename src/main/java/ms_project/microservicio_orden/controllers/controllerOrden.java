package ms_project.microservicio_orden.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms_project.microservicio_orden.entities.Orden;
import ms_project.microservicio_orden.services.ServicioOrden;

@RestController
@RequestMapping("/Orden")
public class controllerOrden {
    ServicioOrden servicioOrden;

    @Autowired
    controllerOrden(ServicioOrden servicioOrden){
        this.servicioOrden = servicioOrden;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Orden get(@PathVariable Long id){
        return servicioOrden.getOrden(id);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Orden save(@RequestBody Orden ordenn){
        return servicioOrden.save(ordenn);
    }
    @CrossOrigin(origins = "*")
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Orden update(@RequestBody Orden ordenn){
        return servicioOrden.update(ordenn);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        servicioOrden.delete(id);
    }
}
