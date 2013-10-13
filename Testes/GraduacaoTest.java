package Testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Classes.Graduacao;
import Classes.Professor;

public class GraduacaoTest {

	Professor p1 = null;
	Graduacao g1 = null;
	
	@Before
	public void setUp() throws Exception {
		g1 = new Graduacao(p1);
		g1.setNome("Licenciatura");
		g1.setInstituicao("UnB");
		g1.setAnoTermino("1993");
		g1.setDuracao("4 anos");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNome() {
		assertEquals("Licenciatura", g1.getNome());
		
	}
	
	@Test
	public void testGetInstituicao() {
		assertEquals("UnB", g1.getInstituicao());
		
	}
	
	@Test
	public void testAnoTermino() {
		assertEquals("1993", g1.getAnoTermino());
		
	}
	
	@Test
	public void testDuracao() {
		assertEquals("4 anos", g1.getDuracao());
		
	}

}
