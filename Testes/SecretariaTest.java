package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Secretaria;

public class SecretariaTest {

	Secretaria s1 = null;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Secretaria("s1", 123, "sec", "1234 - 6543");
		s1.setFolga("terca feira");
	
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetFolga() {
		assertEquals("terca feira", s1.getFolga());
		
	}
	
	@Test
	public void testGetAgenda() {
		String[] Agendas = {"Segunda","Terca"};
		s1.setAgendas(Agendas);
		assertArrayEquals(Agendas, s1.getAgendas());
		
	}

}
