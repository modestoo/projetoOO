//------------------------------ CLASSE FUNCIONARIO ------------------------------------
package Classes;

public class Funcionario {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Funcionario
	private String nome;
	private int codigoIdentificacao;
	private String funcao;
	private String telefone;
	private String endereco;
	private String email;
	private double salario;
        private Direcao direcao;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getNome() {
        return nome;
    }

    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }
    
    public Direcao getDirecao() {
        return direcao;
    }

//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoIdentificacao(int codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sobrecarregado para nao haver instancias sem alguns dados importantes 
	public Funcionario(String nome, int codigoIdentificacao, String funcao, String telefone) {
		this.nome = nome;
		this.codigoIdentificacao = codigoIdentificacao;
		this.funcao = funcao;
		this.telefone = telefone;
	}
	
	//Metodo que retorna o salario do funcionario informado
	public void verificarSalario(int codigoIdentificacao, String nome) {
		System.out.println("O valor de seu salario e:" + this.getSalario());
	}

    
}
