package Classes;

public abstract class Pessoa {
//------------------------------ ATRIBUTOS ------------------------------------
    
	//atributos da classe pessoa
	protected String nome;
	protected String cpf;
	protected int rg;
	protected String telefone;
	protected String endereco;
	protected String email;
	
	//Construtor vazio
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
//------------------------------ GET'S ------------------------------------	
	//Gets dos atributos
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getRg() {
		return rg;
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
//------------------------------ SET'S ------------------------------------	    
	// Sets dos atributos
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
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
	

}
