
//------------------------------ CLASSE SECRETARIA ------------------------------------
package Classes;

public class Secretaria extends Funcionario {
    
//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Sala
	private String folga;
	private String[] agendas = {};
    private Direcao direcao;
    
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    
    public String getFolga() {
		return folga;
	}

	public String[] getAgendas() {
		return agendas;
	}
	
    public Direcao getDirecao() {
        return direcao;
    }
	
//------------------------------ SET'S ------------------------------------
        
  
	//Sets dos Atributos
    
    public void setFolga(String folga) {
		this.folga = folga;
	}

	public void setAgendas(String[] agendas) {
		this.agendas = agendas;
	}
    
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
     
    
	//Construtor sem sobrecarga (vazio)
    public Secretaria(String nome, int codigoIdentificacao, String funcao, String telefone) {
    	
    	//Usando Construtor da Classe Pai
    	super (nome, codigoIdentificacao, funcao, telefone);
    }
    
    //Metodo para listar vetor de atributos agendas
    public void listarAgendas(){
    	for (int i=0; i < agendas.length; i++){
    		System.out.println(agendas[i]);
    	}
    }
    
    //Sobrescrita do metodo GerarRelatorio
    public String gerarRelatorio(){
    	return folga;
    }
    //Sobrescrista do metodo baterPonto
    public String baterPonto(){
    	return folga;
    }
    
 
} 