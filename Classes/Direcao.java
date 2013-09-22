
//------------------------------ CLASSE DIRECAO ------------------------------------
package Classes;

public class Direcao {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Direcao
	private String diretor;
	private String coordenador;
	private String orientador;
	private String psicopedagogo;
        private Funcionario[] funcionarios;
        private Secretaria secretaria;
	
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
        
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    
    public Secretaria getSecretaria() {
        return secretaria;
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
    
      public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
    
    
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Direcao() {
		
	}
	
	//Metodo para advertir alunos por diretores
	public void advertirAluno(String matricula, String nome){
            System.out.println("O aluno " + nome + "ser� advertido!");
	}
        
        //Metedo que adiciona uma secretaria
        public void criarSecretaria(Secretaria secretaria) {
            this.secretaria = secretaria;
        }
}