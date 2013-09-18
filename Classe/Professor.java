package Classes;

public class Professor {

	//Atributos da classe Professor
	private String nome;
	private int codigoIdentificacao;
	private String graduacao;
	private String endereco;
	private String telefone;
	private String email;
	private Disciplina disciplinas[] = {};
	private Sala sala;
	
	//Gets e Sets das classes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(int codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
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

	//Construtor sem sobrecarga (vazio)
	public Professor() {
		
	}

	//Metodo no qual � possivel modificar a gradua��o informado pelo professor
	public void atualizarGraduacao (String graduacao) {
		this.graduacao = graduacao;
		
		System.out.println("O nome e-mail cadastrado �: " + this.graduacao);
	}
}
