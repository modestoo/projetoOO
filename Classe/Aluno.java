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
	private Disciplina disciplinas[] = {};
	
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

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

        //M�todo para conter os n�meros adicionados no vetor
	public void adicionarDisciplina(Disciplina disciplina) {
		int tamanhoAnterior = this.disciplinas.length;
		if(tamanhoAnterior-1 >= 10) {
			System.out.println("N�o � permitido adicionar mais do que 10 disciplinas.");
		} else {
			Disciplina[] novasDisciplinas = new Disciplina [tamanhoAnterior];
			for(int j=0; j < tamanhoAnterior; j++) {
				novasDisciplinas[j] = this.disciplinas[j];
			}
			novasDisciplinas[novasDisciplinas.length-1] = disciplina;
			this.setDisciplinas(novasDisciplinas);
		}
	}
        
	//Construtor sobrecarregado para n�o haver instancias sem alguns dados importantes 
	public Aluno(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco; 	
	}
	
	//Metodo no qual ser� poss�vel matricular novos alunos
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
