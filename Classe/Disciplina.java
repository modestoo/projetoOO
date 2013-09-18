
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
	
	//Sem metodo por enquanto
}
