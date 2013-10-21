
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
	private final static int QUANTIDADEALUNO = 20;

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
    
    public void setAlunos(Aluno[] alunos){
    	this.alunos = alunos;
    }
  
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Sala() {
		
	}
	
	
	//Metodo para determinar a quantidade de alunos em uma sala
	public void criarSala(Aluno alunos){
		if (this.alunos[QUANTIDADEALUNO] != null){
			int tamanhoAnterior = this.getAlunos().length;
			if(tamanhoAnterior-1 >= QUANTIDADEALUNO) {
				System.out.println("\n Nao e permitido adicionar mais do que 20 Alunos.");
			} else {
				Aluno[] novosAlunos = new Aluno [tamanhoAnterior];
				for(int j=0; j < tamanhoAnterior; j++) {
					novosAlunos[j] = this.getAlunos()[j];
				}
				novosAlunos[novosAlunos.length-1] = alunos;
				this.setAlunos(novosAlunos);
			}
			
		} else {
			System.out.println("Nao e possivel adicionar novos alunos!\n" +
					"A quantidade de aluno maxima e: " + QUANTIDADEALUNO);
		}
	}
	
	
	//Metedo ainda nao implementado para informar quantidade de aulos cadastrados
	public void informarQuantidadeDeAluno(){
		System.out.println("Metodo ainda nao implementado!");
	}
} 