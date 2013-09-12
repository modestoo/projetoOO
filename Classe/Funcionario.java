package Classes;

public class Funcionario {

	//Atributos da classe Funcionario
	private String nome;
	private int codigoIdentificacao;
	private String funcao;
	private String telefone;
	private String endereco;
	private String email;
	private double salario;
	
	//Gets e Sets das classes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(int codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Construtor sobrecarregado para não haver instancias sem alguns dados importantes 
	public Funcionario(String nome, int codigoIdentificacao, String funcao, String telefone) {
		this.nome = nome;
		this.codigoIdentificacao = codigoIdentificacao;
		this.funcao = funcao;
		this.telefone = telefone;
	}
	
	//Método que retorna o salario do funcionario informado
	public void verificarSalario(int codigoIdentificacao, String nome) {
		System.out.println("O valor de seu salário é:" + this.salario);
	}

}
