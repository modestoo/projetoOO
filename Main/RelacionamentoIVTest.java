package Main;

//Importacao das classes para utilizacao
import Classes.Aluno;
import Classes.Sala;

//Teste do primeiro relacionamento. Classes: Aluno - Sala
public class RelacionamentoIVTest {
	
	//Construtor da classe com seus parametros vazios
    public RelacionamentoIVTest() {
    }
	
	//Main para testes
	public static void main(String[] args) {
		
		//Instancia de Aluno
		Aluno aluno1 = new Aluno(123, "Joao", "BSB");
		Aluno aluno2 = new Aluno(456, "Maria", "BSB");
		Aluno aluno3 = new Aluno(789, "Pedro", "BSB");
				
		//Instancia de secretaria
		Sala sala1 = new Sala(10, "2º Ano");
		sala1.informarQuantidadeDeAluno();
		
		//Testando vetor Alunos[] e metodo informarQuantidadeDeAluno()
		Aluno[] sala2 = {aluno1, aluno2};
		sala1.setAlunos(sala2);
		sala1.informarQuantidadeDeAluno();
		
		//Testando atributo sala
		System.out.println("O aluno " + sala1.getAlunos()[0].getNome() + " pertence a turma: " + sala1.getTurma());
		
		//Testando metodo criarSala e listarAlunos
		sala1.criarSala(aluno3);
		System.out.println("O aluno " + sala1.getAlunos()[2].getNome() + " pertence a turma: " + sala1.getTurma());
		sala1.listarAlunos();

	}

}
