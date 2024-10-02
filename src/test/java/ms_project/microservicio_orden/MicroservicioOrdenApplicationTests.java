package ms_project.microservicio_orden;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ms_project.microservicio_orden.controllers.controllerOrden;
import ms_project.microservicio_orden.entities.Orden;
import ms_project.microservicio_orden.services.ServicioOrden;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MicroservicioOrdenApplicationTests {

	@Mock
	private ServicioOrden servicioOrdenMock;

	@InjectMocks
	private controllerOrden controllerOrden;

	@Test
	void contextLoads() {
	}
	@Test
	public void testGetOrdenById() {
		Long id = 1L;
		Orden expectedOrden = new Orden();
		
		when(servicioOrdenMock.getOrden(id)).thenReturn(expectedOrden);
		
		Orden actualOrden = controllerOrden.get(id);
		
		verify(servicioOrdenMock).getOrden(id);
		assertEquals(expectedOrden, actualOrden);
	}

	@Test
	public void testSaveOrden() {
		Orden orden = new Orden();
		Orden expectedOrden = new Orden();
		
		when(servicioOrdenMock.save(orden)).thenReturn(expectedOrden);
		
		Orden actualOrden = controllerOrden.save(orden);
		
		verify(servicioOrdenMock).save(orden);
		assertEquals(expectedOrden, actualOrden);
	}

	@Test
	public void testUpdateOrden() {
		Orden orden = new Orden();
		Orden expectedOrden = new Orden();
		
		when(servicioOrdenMock.update(orden)).thenReturn(expectedOrden);
		
		Orden actualOrden = controllerOrden.update(orden);
		
		verify(servicioOrdenMock).update(orden);
		assertEquals(expectedOrden, actualOrden);
	}

	@Test
	public void testDeleteOrdenById() {
		Long id = 1L;
		
		controllerOrden.delete(id);
		
		verify(servicioOrdenMock).delete(id);
	}

}
