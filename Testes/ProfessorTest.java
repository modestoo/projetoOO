package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Professor;

public class ProfessorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetEspecializacao() {
		Professor p1 = new Professor("p1", 123, "prof", "9876 - 6789");
		p1.setEspecializacao("Pedagocia");
		assertEquals(p1.getEspecializacao(), "Pedagocia");
		
	}

	@Test
	public void testSetHorarioDeAula() {
		Professor p1 = new Professor("p1", 123, "prof", "9876 - 6789");
		p1.setHorarioDeAula("7:00 as 12:00");
		assertEquals(p1.getHorarioDeAula(), "7:00 as 12:00");
		
	}

	@Test
	public void testGetConteudoMinistrado() {
		Professor p1 = new Professor("p1", 123, "prof", "9876 - 6789");
		p1.setConteudoMinistrado("Portugues");
		assertEquals(p1.getConteudoMinistrado(), "Portugues");
		
	}

}
