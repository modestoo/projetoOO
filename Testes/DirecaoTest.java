package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Classes.Direcao;

public class DirecaoTest {

	Direcao d1 = null;
	
	@Before
	public void setUp() throws Exception {
		d1 = new Direcao();
		d1.setDiretor("Francisco");
		d1.setCoordenador("Joao");
		d1.setOrientador("Marcos");
		d1.setPsicopedagogo("Maria");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDiretor() {
		assertEquals("Francisco", d1.getDiretor());
	}
	
	@Test 
	public void testGetCoordenador() {
		assertEquals("Joao", d1.getCoordenador());
		
	}
	
	@Test 
	public void testGetOrientador() {
		assertEquals("Marcos", d1.getOrientador());
		
	}
	
	@Test 
	public void testGetPsicopedagogo() {
		assertEquals("Maria", d1.getPsicopedagogo());
		
	}
	
	@Test 
	public void testCriarSecretaria() {
		assertEquals("Joao", d1.getCoordenador());
		
	}

}
