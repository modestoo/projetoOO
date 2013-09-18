package Classes;

public class Disciplina {
	
	//Atributos da classe Disciplina
	private int codigo;
	private String nome;
	private Aluno alunos[] = {};
	private Professor professor;

	//Gets e Sets das classes
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
        
	//Construtor sem sobrecarga (vazio)
	public Disciplina() {
		
	}
	
	//Sem método por enquanto

}
