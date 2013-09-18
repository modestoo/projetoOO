package escola;

//Importação das classes para utilização
import Classes.Aluno;
import Classes.Funcionario;
import Classes.Responsavel;

public class Escola {

	//Construtor da classe com seus parâmetros vazios
	public Escola() {
	
	}

	//Testando as instâncias da classe Aluno, Funcionario e Responsavel
	public static void main(String[] args) {
		
		//Instância da classe Aluno 
		Aluno aluno1 = new Aluno (00000, "Aluno", "Endereco");
		aluno1.matricularAluno(12345, "Aluno1", "12/09/2013", "Endereco1", "Email1@gmail.com", "Serie1");
		System.out.println("Matricula: " + aluno1.getMatricula() + "  Nome: " + aluno1.getNome() + "  Data de Nascimento: " + aluno1.getDataNascimento() + "  Endereco: "  + aluno1.getEndereco() + "  Email: " + aluno1.getEmail() + "  Serie:  " + aluno1.getSerie() );
		
		//Instância da classe Funcionario
		Funcionario funcionario1 = new Funcionario("Funcionario1", 12345, "Funcao1", "33333331");
		System.out.println("Nome: " + funcionario1.getNome() + "  Codigo de identificacao:  " + funcionario1.getCodigoIdentificacao() + " Funcao:  " +  funcionario1.getFuncao() +  "Telefone:  "  + funcionario1.getTelefone());
		
		//Instância da classe Responsavel
		Responsavel responsavel1 = new Responsavel("Pai1", "33333332", "Mae1", "33333333");
		System.out.println("Nome do Pai: " + responsavel1.getNomePai() + "  Telefone do Pai: " + responsavel1.getTelefonePai() + "  Nome da Mae:  " + responsavel1.getNomeMae() + "  Telefone da Mae:  " + responsavel1.getTelefoneMae() );
	}
}
