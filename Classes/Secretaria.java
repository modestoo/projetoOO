
//------------------------------ CLASSE SECRETARIA ------------------------------------
package Classes;

public class Secretaria {
    
//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Sala
	private String cpf;
	private String nome;
	private String matricula;
	private String funcao;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getFuncao() {
        return funcao;
    }
	
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sem sobrecarga (vazio)
	public Secretaria() {
		
	}
	
	
} 
    

