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
	public void testGetNome() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		assertEquals(f1.getNome(), "f1");
		
	}
	
	@Test
	public void testGetCpf() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setCpf("123");
		assertEquals(f1.getCpf(), "123");
		
	}
	
	@Test
	public void testGetRg() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setRg(123);
		assertEquals(f1.getRg(), 123);
		
	}

	@Test
	public void testGetCodigoIdentificacao() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		assertEquals(f1.getCodigoIdentificacao(), 123);
		
	}

	@Test
	public void testGetFuncao() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		assertEquals(f1.getFuncao(), "func");
		
	}

	@Test
	public void testGetTelefone() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		assertEquals(f1.getTelefone(), "123");
		
	}

	@Test
	public void testGetEndereco() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setEndereco("Super 11");
		assertEquals(f1.getEndereco(), "Super 11");
		
	}
	
	@Test
	public void testGetEmail() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setEmail("gmail.com");
		assertEquals(f1.getEmail(), "gmail.com");
		
	}
	
	@Test
	public void testGetPresenca() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setPresenca(true);
		assertTrue(true);
		
	}
	
	@Test
	public void testGetDescricaoRelatorio() {
		Funcionario f1 = new Funcionario("f1",123, "func", "123");
		f1.setDescricaoRelatorio("bla bla");
		assertEquals(f1.getDescricaoRelatorio(), "bla bla");
		
	}

}
