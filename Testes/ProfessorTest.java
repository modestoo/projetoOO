package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Professor;

public class ProfessorTest {
	
	Professor p1 = null;

	@Before
	public void setUp() throws Exception {
		p1 = new Professor("p1", 123, "prof", "9876 - 6789");
		p1.setEspecializacao("Pedagocia");
		p1.setHorarioDeAula("7:00 as 12:00");
		p1.setConteudoMinistrado("Portugues");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetEspecializacao() {
		assertEquals("Pedagocia", p1.getEspecializacao());
		
	}

	@Test
	public void testSetHorarioDeAula() {
		assertEquals("7:00 as 12:00", p1.getHorarioDeAula());
		
	}

	@Test
	public void testGetConteudoMinistrado() {
		assertEquals("Portugues", p1.getConteudoMinistrado());
		
	}

}
