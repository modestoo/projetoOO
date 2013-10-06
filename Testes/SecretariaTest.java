package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Secretaria;

public class SecretariaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNome() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		assertEquals(s1.getNome(), "s1");
		
	}
		
	@Test
	public void testGetTelefone() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		assertEquals(s1.getTelefone(), "1234 - 6543");
			
	}
	
	@Test
	public void testGetFuncao() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		assertEquals(s1.getFuncao(), "sec");
			
	}

	@Test
	public void testGetcodigoIdentificacao() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		assertEquals(s1.getCodigoIdentificacao(), 123);
			
	}
	
	@Test
	public void testGetFolga() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		s1.setFolga("terca feira");
		assertEquals(s1.getFolga(), "terca feira");
	}

}
