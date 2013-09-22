
//------------------------------ CLASSE DIRECAO ------------------------------------
package Classes;

public class Direcao {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Direcao
	private String diretor;
	private String coordenador;
	private String orientador;
	private String psicopedagogo;
	private String secretaria;
        private Funcionario[] Funcionarios;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getDiretor() {
        return diretor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public String getOrientador() {
        return orientador;
    }

    public String getPsicopedagogo() {
        return psicopedagogo;
    }

    public String getSecretaria() {
        return secretaria;
    }
        
    public Funcionario[] getFuncionarios() {
        return Funcionarios;
    }

//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public void setPsicopedagogo(String psicopedagogo) {
        this.psicopedagogo = psicopedagogo;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public void setFuncionarios(Funcionario[] Funcionarios) {
        this.Funcionarios = Funcionarios;
    }
  
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Direcao() {
		
	}
	
	//Metodo para advertir alunos por diretores
	public void advertirAluno(String matricula, String nome){
		System.out.println("O aluno " + nome + "ser� advertido!");
	}
}