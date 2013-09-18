package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Funcionario;

public class FuncionarioTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iniciando...");
	}

	@Test
	public void testFuncionario() {
		Funcionario funcionario1 = new Funcionario("Nome1", 12345, "Funcao1", "33333333");
		assertEquals("Nome1", funcionario1.getNome());
		assertEquals(12345, funcionario1.getCodigoIdentificacao());
		assertEquals("Funcao1", funcionario1.getFuncao());
		assertEquals("33333333", funcionario1.getTelefone());
		
	}

}
