package Classes;

public class Aluno {

	//Atributos da classe Aluno
	private int matricula;
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String email;
	private String serie;
	private Responsavel responsavel;
	private Disciplina disciplina[] = {};
	
	//Gets e Sets das classes
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	//Construtor sobrecarregado para não haver instancias sem alguns dados importantes 
	public Aluno(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco; 	
	}
	
	//Metodo no qual será possível matricular novos alunos
	public void matricularAluno(int matricula, String nome, String dataNascimento,
			String endereco, String email, String serie ) {
		this.matricula = matricula;
		this.nome= nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.email = email;
		this.serie = serie;
		System.out.println("Dados cadastrados!");
	}

}
