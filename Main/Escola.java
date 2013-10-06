package Main;

//Importacao das classes para utilizacao
import Classes.Aluno;
import Classes.Funcionario;
import Classes.Responsavel;

public class Escola {

	//Construtor da classe com seus parametros vazios
	public Escola() {
	
	}

	//Testando as instancias da classe Aluno, Funcionario e Responsavel
	public static void main(String[] args) {
		
		//Instancia da classe Aluno 
		Aluno aluno1 = new Aluno (00000, "Aluno", "Endereco");
		aluno1.matricularAluno(12345, "Aluno1", "12/09/2013", "Endereco1", "Email1@gmail.com", "Serie1");
		System.out.println("\n Matricula: " + aluno1.getMatricula()
				+ "\n Nome: "+ aluno1.getNome()
				+ "\n Data de Nascimento: " + aluno1.getDataNascimento()
				+ "\n Endereco: "  + aluno1.getEndereco()
				+ "\n Email: " + aluno1.getEmail()
				+ "\n Serie: " + aluno1.getSerie()
		);
		
		//Instancia da classe Funcionario
		Funcionario funcionario1 = new Funcionario("Funcionario1", 12345, "Funcao1", "33333331");
		System.out.println("\n\n Nome: " + funcionario1.getNome()
				+ "\n Codigo de identificacao: " + funcionario1.getCodigoIdentificacao() 
				+ "\n Funcao: " +  funcionario1.getFuncao()
				+ "\n Telefone: "  + funcionario1.getTelefone()
		);
		
		//Instancia da classe Responsavel
		Responsavel responsavel1 = new Responsavel("Pai1", "33333332", "Mae1", "33333333");
		responsavel1.cadastrarPai("Pai1", "123.123.123.123-12", 12345, "1234 - 4321", "email.@email.com");
		responsavel1.cadastrarMae("Mae1", "123.123.123.123-12", 12345, "1234 - 4321", "email.@email.com");
		System.out.println("\n Nome do Pai: " + responsavel1.getNomePai()
				+ "\n Telefone do Pai: " + responsavel1.getTelefonePai()
				+ "\n\n Nome da Mae: " + responsavel1.getNomeMae()
				+ "\n Telefone da Mae: " + responsavel1.getTelefoneMae()
		);
	}
}
