//------------------------------ CLASSE FUNCIONARIO ------------------------------------
package Classes;

public class Funcionario extends Pessoa {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Funcionario
	protected int codigoIdentificacao;
	protected String funcao;
	protected boolean presenca = false; //Caso o professor nao utlize o metodo baterPonto, ele automaticamente tira uma falta;
	protected String descricaoRelatorio;
	protected Direcao direcao;
	
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos

	public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public boolean isPresenca() { //Condicao para exibicao
		if (presenca == false){
			System.out.println("O funcionario " + getNome() +" nao bateu ponto!");
		} else {
			System.out.println("O funcionario " + getNome() +" ja bateu ponto!");
		}
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
    

	public void setCodigoIdentificacao(int codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
	
	
	 //Metodo para cadastrar a descricao do registro de atividades
    public void cadastrarDescricaoRelatorio(String descricaoRelatorio){
    	this.descricaoRelatorio = descricaoRelatorio;
    }
	
        
    //Metodo para criar uma direcao
	public void criarDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	
	//Metodo para polimorfismos
	public void gerarRelatorio() {
		
	}
	
	
	//Metodo para polimorfismos
	public void baterPonto() {
		
	}

}
