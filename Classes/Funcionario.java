//------------------------------ CLASSE FUNCIONARIO ------------------------------------
package Classes;

public class Funcionario {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Funcionario
	protected String nome;
	protected String cpf;
	protected int rg;
	protected int codigoIdentificacao;
	protected String funcao;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected boolean presenca;
	protected String descricaoRelatorio;
	protected Direcao direcao;
	
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
	
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
		return cpf;
	}

	public int getRg() {
		return rg;
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
    
    public boolean isPresenca() {
		return presenca;
	}
    
    public String getDescricaoRelatorio() {
    	return descricaoRelatorio;
    }
    
    public Direcao getDirecao() {
        return direcao;
    }
    

//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    
	public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
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
  
    public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}
    
    public void setDescricaoRelatorio (String descricaoRelatorio){
    	this.descricaoRelatorio = descricaoRelatorio;
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
	
        
    //Metodo para criar uma direcao
	public void criarDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	
}
