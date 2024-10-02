package ms_project.microservicio_orden.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empaquetado {
    private Orden orden;
    private Tarjeta tarjeta;
}
