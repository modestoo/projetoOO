package Testes;

//Importacao das classes para utilizacao
import Classes.Responsavel;
import Classes.Aluno;

//Teste do primeiro relacionamento. Classes: Responsavel - Aluno
public class RelacionamentoITest {

	//Construtor da classe com seus parametros vazios
	public RelacionamentoITest() {
	}

	public static void main(String[] args) {
            Responsavel responsavel1 = new Responsavel("Pai1", "9876-9876", "Mae1", "1234-1234");
            responsavel1.cadastrarPai("Pai1", "999.888.777-11", 12345, "9876-9876", "pai@pai.com");
            responsavel1.cadastrarMae("Mae1", "111.222.333-44", 54321, "1234-1234", "mae@mae.com");
            
            Aluno aluno1 = new Aluno(111, "Aluno1", "QD 01 CS 01");
            aluno1.matricularAluno(111, "Aluno1", "01/01/2001", "QD 01 CS 01", "Aluno1@aluno.com", "4º");
            
            Aluno aluno2 = new Aluno(222, "Aluno2", "QD 02 CS 02");
            aluno2.matricularAluno(222, "Aluno2", "02/02/2002", "QD 02 CS 02", "Aluno2@aluno.com", "2º");
            
            Aluno[] alunos3 =  {aluno1, aluno2};
            responsavel1.setAlunos(alunos3);
            
            System.out.println(responsavel1);
            //System.out.println(alunos3);
            //System.out.println(aluno2);
	}

		
}
