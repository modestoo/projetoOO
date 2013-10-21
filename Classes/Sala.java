
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
	
	
	//Construtor com sobrecarga
	public Sala(int numero, String turma) {
		this.numero = numero;
		this.turma = turma;
	}
	
	
	//Metodo para determinar a quantidade de alunos em uma sala
	public void criarSala(Aluno alunos){
			int tamanhoAnterior = this.getAlunos().length;
			if(tamanhoAnterior > QUANTIDADEALUNO) {
				System.out.println("\n Nao e permitido adicionar mais do que 20 Alunos.");
			} else {
				Aluno[] novosAlunos = new Aluno [tamanhoAnterior + 1];
				for(int j=0; j < tamanhoAnterior; j++) {
					novosAlunos[j] = this.getAlunos()[j];
				}
				novosAlunos[novosAlunos.length-1] = alunos;
				this.setAlunos(novosAlunos);
				System.out.println("Aluno cadastrado com sucesso.");
			}
	}
	
	
	//Metedo para informar quantidade de aulos cadastrados
	public void informarQuantidadeDeAluno(){
		int quantidadeAlunos = this.getAlunos().length;
		System.out.println("Quantidade de aluno na turma " + this.getTurma() + " e: " + quantidadeAlunos);
	}
	
	
	//Metodo que informa quais alunos pertencem a determinada Sala
    public void listarAlunos(){
    	for (int i=0; i < alunos.length; i++){
    		System.out.println(alunos[i].getNome());
    	}
    }
} 