package ms_project.microservicio_orden.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarjeta {
    private String no_tarjeta;
    private String caducidad;
    private String nombre;
    private String codigo_s;
}
