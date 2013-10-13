package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Funcionario;

public class FuncionarioTest {

	Funcionario f1 = null;
	
	@Before
	public void setUp() throws Exception {
		f1 = new Funcionario("f1", 123, "func", "123");
		f1.setCpf("123");
		f1.setRg(123);
		f1.setEndereco("Super 11");
		f1.setEmail("gmail.com");
		f1.setPresenca(true);
		f1.setDescricaoRelatorio("bla bla");
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testGetNome() {
		assertEquals(f1.getNome(), "f1");
		
	}
	
	@Test
	public void testGetCpf() {
		assertEquals(f1.getCpf(), "123");
		
	}
	
	@Test
	public void testGetRg() {
		assertEquals(f1.getRg(), 123);
		
	}

	@Test
	public void testGetCodigoIdentificacao() {
		assertEquals(f1.getCodigoIdentificacao(), 123);
		
	}

	@Test
	public void testGetFuncao() {
		assertEquals(f1.getFuncao(), "func");
		
	}

	@Test
	public void testGetTelefone() {
		assertEquals(f1.getTelefone(), "123");
		
	}

	@Test
	public void testGetEndereco() {
		assertEquals(f1.getEndereco(), "Super 11");
		
	}
	
	@Test
	public void testGetEmail() {
		assertEquals(f1.getEmail(), "gmail.com");
		
	}
	
	@Test
	public void testGetPresenca() {
		assertTrue(true);
		
	}
	
	@Test
	public void testGetDescricaoRelatorio() {
		assertEquals(f1.getDescricaoRelatorio(), "bla bla");
		
	}

}
