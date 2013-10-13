package Main;

//Importacao das classes para utilizacao
import Classes.Professor;
import Classes.Secretaria;

//Teste do polimorfismo. Classes: Funcionario (super), Secretaria e Professor (subs)
public class PolimorfismoTest {

	//Construtor da classe com seus parametros vazios
	public PolimorfismoTest() {
	}

	public static void main(String[] args) {
		
		//Isntancias de Objeto (P1 e S1)
		Professor p1 = new Professor("Joazinho", 123, "Professor Substituto","9876-6789");
		Secretaria s1 = new Secretaria("Mariazinha", 321, "Secretaria Geral", "9876-3210");
		
		//Testado metodo BATERPONTO de p1 (Joaozinho)
		p1.isPresenca();
		p1.baterPonto();
		p1.cadastrarConteudoMinistrado("Portugues.");
		p1.baterPonto();
		
		//Testando metodo GERARRELATORIO de p1 (Joaozinho)
		p1.gerarRelatorio();
		p1.cadastrarDescricaoRelatorio("blá blá blá");
		p1.gerarRelatorio();
		p1.cadastrarConteudoMinistrado("Portugues");
		p1.gerarRelatorio();
		
		//Testado metodo BATERPONTO de s1 (Mariazinha)
		s1.isPresenca();
		s1.baterPonto();
		s1.cadastrarFolga("segunda-feira");
		s1.baterPonto();
		
		//Testando metodo GERARRELATORIO de s1 (Mariazinha)
		s1.gerarRelatorio();
		s1.cadastrarDescricaoRelatorio("blé blé blé");
		s1.gerarRelatorio();
		s1.cadastrarFolga("segunda-feira");
		s1.gerarRelatorio();
	}

}
