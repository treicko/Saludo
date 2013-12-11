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

}
