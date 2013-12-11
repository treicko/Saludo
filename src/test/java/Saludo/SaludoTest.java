package Saludo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SaludoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ElSaludoAunNombreVacioEsElMismoSaludo() {
		Saludo saludo = new Saludo();
		String mensaje = "Bienvenido: ";
		assertEquals(mensaje, saludo.Saludar(mensaje,""));
	}
	
	@Test
	public void ElSaludoAunNombreEsElMismoSaludoMasElNombre() {
		Saludo saludo = new Saludo();
		String mensaje = "Bienvenido: ";
		String nombre = "Leonardo";
		assertEquals(mensaje+nombre, saludo.Saludar(mensaje,nombre));
	}

}
