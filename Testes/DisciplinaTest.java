package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Classes.Disciplina;

public class DisciplinaTest {

	Disciplina d1 = null;
	
	@Before
	public void setUp() throws Exception {
		d1 = new Disciplina();
		d1.setCodigo(123);
		d1.setNome("Portugues");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testGetCodigo() {
		assertEquals(123, d1.getCodigo());
	}
	
	@Test 
	public void testGetNome() {
		assertEquals("Portugues", d1.getNome());
		
	}

}
