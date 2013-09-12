package Classes;

public class Direcao {

	//Atributos da classe Direcao
	private String diretor;
	private String coordenador;
	private String orientador;
	private String psicopedagogo;
	private String secretaria;
	
	//Gets e Sets das classes
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String getPsicopedagogo() {
		return psicopedagogo;
	}

	public void setPsicopedagogo(String psicopedagogo) {
		this.psicopedagogo = psicopedagogo;
	}

	public String getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}

	//Construtor sem sobrecarga (vazio)
	public Direcao(String matricula, String nome) {
		
	}
	
	//Metodo para advertir alunos por diretores
	public void advertirAluno(String matricula, String nome){
		System.out.println("O aluno " + nome + "será advertido!");
	}

}
