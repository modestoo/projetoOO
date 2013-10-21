
//------------------------------ CLASSE SALA ------------------------------------
package Classes;

public class Sala {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Sala
	private int numero;
	private String turma;
	private String professorResponsavel;
	private String faixaEtaria;
	private Professor Professor; 
	private Aluno[] alunos = {};

//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
	
    public int getNumero() {
        return numero;
    }

    public String getTurma() {
        return turma;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public Professor getProfessor() {
        return Professor;
    }
    
    public Aluno[] getAlunos() {
    	return alunos;
    }
	
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }
    
    public void setAluno(Aluno[] alunos){
    	this.alunos = alunos;
    }
  
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Sala() {
		
	}
	
	//Metedo ainda nao implementado para informar quantidade de aulos cadastrados
	public void informarQuantidadeDeAluno(){
		System.out.println("Metodo ainda nao implementado!");
	}
} 