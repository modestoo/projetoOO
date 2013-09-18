package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Responsavel;

public class ResponsavelTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iniciando...");
	}

	@Test
	public void testResponsavel() {
		Responsavel responsavel1 = new Responsavel("Pai1", "33333331", "Mae1", "33333332");
		assertEquals("Pai1", responsavel1.getNomePai());
		assertEquals("33333331", responsavel1.getTelefonePai());
		assertEquals("Mae1", responsavel1.getNomeMae());
		assertEquals("33333332", responsavel1.getTelefoneMae());
		
	}

	@Test
	public void testCadastrarPai(){
		Responsavel responsavel2 = new Responsavel("Pai2", "33333334", "Mae1", "33333332");
		responsavel2.cadastrarPai("Pai3", "33333331", 22222, "33333332", "emailPai2");
		assertEquals("Pai3", responsavel2.getNomePai());
		assertEquals("33333331", responsavel2.getCpfPai());
		assertEquals(22222, responsavel2.getRgPai());
		assertEquals("33333332", responsavel2.getTelefonePai());
		assertEquals("emailPai2", responsavel2.getEmailPai());	
	}
		
	@Test
	public void testCadastrarMae(){
		Responsavel responsavel3 = new Responsavel("Mae2", "33333334", "Mae1", "33333332");
		responsavel3.cadastrarMae("Mae3", "33333333", 22223, "33333334", "emailMae2");
		assertEquals("Mae3", responsavel3.getNomeMae());
		assertEquals("33333333", responsavel3.getCpfMae());
		assertEquals(22223, responsavel3.getRgMae());
		assertEquals("33333334", responsavel3.getTelefoneMae());
		assertEquals("emailMae2", responsavel3.getEmailMae());	
		
}
	
}
