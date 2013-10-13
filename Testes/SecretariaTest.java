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
	public void testGetFolga() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		s1.setFolga("terca feira");
		assertEquals(s1.getFolga(), "terca feira");
	}
	
	@Test
	public void testGetAgenda() {
		Secretaria s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		String[] Agendas = {"Segunda","Terca"};
		s1.setAgendas(Agendas);
		assertArrayEquals(s1.getAgendas(), Agendas);
	}

}
