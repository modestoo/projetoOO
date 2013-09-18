package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Aluno;



public class AlunoTest {

	
	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iniciando...");
	}

	@Test
	public void testMatricularAluno() {
		Aluno aluno1 = new Aluno(00000, "Aluno", "Endereco");
		aluno1.matricularAluno(12345, "Aluno1", "12/09/2013", "Endereco1", "Email1@gmail.com", "Serie1");
		assertEquals(12345, aluno1.getMatricula());
		assertEquals("Aluno1", aluno1.getNome());
		assertEquals("12/09/2013", aluno1.getDataNascimento());
		assertEquals("Email1@gmail.com", aluno1.getEmail());
		assertEquals("Serie1", aluno1.getSerie());
		
	}

}
