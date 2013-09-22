//------------------------------ CLASSE GRADUACAO ------------------------------------
package Classes;

public class Graduacao {
   
//------------------------------ ATRIBUTOS ------------------------------------
    
	//Atributos da classe Professor
	private String nome;
	private String instituicao;
	private String anoTermino;
	private String duracao;
        private Professor professor;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getNome() {
        return nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String getAnoTermino() {
        return anoTermino;
    }

    public String getDuracao() {
        return duracao;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setAnoTermino(String anoTermino) {
        this.anoTermino = anoTermino;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    
          
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
        //Construtor sem sobrecarga (vazio)
	public Graduacao(Professor professor) {
            this.professor = professor;
    
	}
        
        
}
