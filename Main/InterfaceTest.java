package Main;

//Importacao das classes para utilizacao
import Classes.*;

//Teste do interface. Classes: Aluno, Secretaria e Professor
//Interfaces: Interagivel e Funcionavel
public class InterfaceTest {

	//Construtor da classe com seus parametros vazios
	public InterfaceTest() {
	}
	
	public static void main(String[] args) {
		
		//TESTANDO A INTERFACE FUNCIONAVEL
		//Isntancias de Objeto (Professor1 e Secretaria1)
		Professor professor1 = new Professor("Claudio", 123, "Professor Substituto","9876-6789");
		Secretaria secretaria1 = new Secretaria("Cristina", 321, "Secretaria Geral", "9876-3210");
				
		//Testado metodo BATERPONTO de professor1 (Claudio)
		professor1.isPresenca();
		professor1.baterPonto();
		professor1.cadastrarConteudoMinistrado("Portugues.");
		professor1.baterPonto();
				
		//Testando metodo GERARRELATORIO de professor1 (Claudio)
		professor1.gerarRelatorio();
		professor1.cadastrarDescricaoRelatorio("blá blá blá");
		professor1.gerarRelatorio();
		professor1.cadastrarConteudoMinistrado("Portugues");
		professor1.gerarRelatorio();
				
		//Testado metodo BATERPONTO de secretaria1 (Cristina)
		secretaria1.isPresenca();
		secretaria1.baterPonto();
		secretaria1.cadastrarFolga("segunda-feira");
		secretaria1.baterPonto();
				
		//Testando metodo GERARRELATORIO de secretaria1 (Cristina)
		secretaria1.gerarRelatorio();
		secretaria1.cadastrarDescricaoRelatorio("blé blé blé");
		secretaria1.gerarRelatorio();
		secretaria1.cadastrarFolga("segunda-feira");
		secretaria1.gerarRelatorio();
		
		
		//TESTANDO A INTERFACE INTERAGIVEL
		//Intanciando aluno1
		Aluno aluno1 = new Aluno(123, "Matheus", "SQ 11");
		aluno1.matricularAluno(123, "Matheus da Costa", "10/10/2006", "SQ 11", "@aluno.com", "3º Ano");
		
		//Utilizando metodo 
		String[] contatos = {"Carol", "Vinicius", "Gabriel"};
		aluno1.startaTexto("Oi gente!!!", contatos);

	}

}
