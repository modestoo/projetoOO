//------------------------------ CLASSE DISCIPLINA ------------------------------------
package Classes;

public class Disciplina {
	
//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Disciplina
	private int codigo;
	private String nome;
	private Aluno alunos[] = {};
	private Professor professor;

//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
	
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
          
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Disciplina() {
	}
	
	//Metodo para conter os numeros adicionados no vetor
    public void adicionarAluno(Aluno aluno) {
		int tamanhoAnterior = this.getAlunos().length;
		if(tamanhoAnterior-1 >= 40) {
			System.out.println("Nao e permitido adicionar mais do que 10 alunos.");
		} else {
			Aluno[] novosAlunos = new Aluno [tamanhoAnterior];
			for(int j=0; j < tamanhoAnterior; j++) {
				novosAlunos[j] = this.getAlunos()[j];
			}
			novosAlunos[novosAlunos.length-1] = aluno;
			this.setAlunos(novosAlunos);
		}
	}
	
	//Metodo para exibicao de dados na tela
    public String toString(){
         return "\n Dados do Disciplina"
                    + "\n Código: " + getCodigo()
                    + "\n Nome: " + getNome()
                    + "\n Professor: " + getProfessor()
                    + "\n Alunos: " + getAlunos();
    }
}
