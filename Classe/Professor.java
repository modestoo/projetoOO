package Classes;

public class Professor {

	//Atributos da classe Professor
	private String nome;
	private int codigoIdentificacao;
	private String graduacao;
	private String endereco;
	private String telefone;
	private String email;
	private Disciplina disciplina[] = {};
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
	
	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	//Construtor sem sobrecarga (vazio)
	public Professor() {
		
	}

	//Metodo no qual é possivel modificar a graduação informado pelo professor
	public void atualizarGraduacao (String graduacao) {
		this.graduacao = graduacao;
		
		System.out.println("O nome e-mail cadastrado é: " + this.graduacao);
	}
}
