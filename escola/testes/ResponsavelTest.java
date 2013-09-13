package escola.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Responsavel;

public class ResponsavelTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iniciando...");
	}

	@Test
	public void testResponsavel() {
		Responsavel responsavel1 = new Responsavel("Pai1", "33333331", "Mae1", "33333332");
		assertEquals("Pai1", responsavel1.getNomePai());
		assertEquals("33333331", responsavel1.getTelefonePai());
		assertEquals("Mae1", responsavel1.getNomeMae());
		assertEquals("33333332", responsavel1.getTelefoneMae());
		
	}

}
