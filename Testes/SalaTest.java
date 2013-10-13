package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Classes.Sala;

public class SalaTest {

	Sala s1 = null;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Sala();
		s1.setNumero(10);
		s1.setTurma("1º Ano A");
		s1.setFaixaEtaria("10 a 11");
		s1.setProfessorResponsavel("Mariazinha");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNumero() {
		assertEquals(10, s1.getNumero());
		
	}
	
	@Test
	public void testGetTurma() {
		assertEquals("1º Ano A", s1.getTurma());
		
	}
	
	@Test
	public void testGetFaixaEtaria() {
		assertEquals("10 a 11", s1.getFaixaEtaria());
		
	}
	
	@Test
	public void testGetProfessorResponsavel() {
		assertEquals("Mariazinha", s1.getProfessorResponsavel());
		
	}

}
