package Main;

//Importacao das classes para utilizacao
import Classes.Professor;
import Classes.Secretaria;

//Teste do terceiro relacionamento. Classes: Funcionario - Professor
public class RelacionamentoIIITest {

	//Construtor da classe com seus parametros vazios
    public RelacionamentoIIITest() {
    }
    
    //Main para testes
	public static void main(String[] args) {
		
		//Instancia de professor
		Professor professor1 = new Professor("Professor1", 123, "Prof", "1234-4321");
		professor1.setEspecializacao("Pedagogo");
		professor1.setHorarioDeAula("7:30 - 12:30");
		
		//Testando heran�a de professor e funcionario
		System.out.println("A especializa��o do professor " + professor1.getNome() +
				" �: " + professor1.getEspecializacao() + ". Sua aula �:" + professor1.getHorarioDeAula());
		
		
		//Instancia de secretaria
		Secretaria secretaria1 = new Secretaria("Secretaria1", 123, "Sec", "9876-6789");
		secretaria1.setFolga("ter�as feiras");
		String [] agendas = {"1 de Agosto", "5 de agosto"};
		secretaria1.setAgendas(agendas);
		
		//Testando heran�a
		System.out.println("A " + secretaria1.getNome() + " tem folga as " + secretaria1.getFolga()
				+ " e sua agenda �:");
		secretaria1.listarAgendas();
	}

}
