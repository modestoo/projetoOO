package Classes;

public class Sala {

	//Atributos da classe Sala
	private int numero;
	private String turma;
	private String professorResponsavel;
	private String faixaEtaria;
	
	//Gets e Sets das classes
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(String professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	//Construtor sem sobrecarga (vazio)
	public Sala() {
		
	}
	
	//Metedo ainda não implementado para informar quantidade de aulos cadastrados
	public void informarQuantidadeDeAluno(){
		System.out.println("Método ainda não implementado!");
	}
	
	

} 
