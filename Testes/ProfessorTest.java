package Testes;

import Classes.Professor;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAtualizarGraduacao() {
		Professor professor1 = new Professor();
		professor1.atualizarGraduacao("graduacao1");
		assertEquals("graduacao1", professor1.getGraduacao());
		
	}
}

