
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
    
    
    //Metodo para cadastrar folga da secretaria
    public void cadastrarFolga(String folga) {
    	this.folga = folga;
    }
    
    
    //Metodo para exibir a folga da Secretaria caso ela tenha
    public void exibirFolga(String folga){
    	if (folga == null){
    		System.out.println("A folga da secretaria " + getNome() + " nao possui folga!");
    	} else {
    		System.out.println("A folga da secretaria " + getNome() + " sera: " + getFolga());
    	}
    }
    
    
    //Metodo com polimorfismo para constar presenca no trabalho
    public void baterPonto() {
    	setPresenca(true);
		isPresenca();
		this.exibirFolga(this.folga);
    }
    
    
    //Metodo com polimorfismo (Super Funcionario) para gerar relatorio de atividades
    public void gerarRelatorio() {
    	if (this.descricaoRelatorio == null){
    		System.out.println("Antes de gerar relatorio, voce precisa cadastrar a descricao!");
    	} else {
    		if (this.folga == null){
    			System.out.println("\nRELATORIO DE ATIVIDADES"+
    					"\nDescricao do relatorio:\n" + getDescricaoRelatorio() +
    					"\nFolga sera: \nSEM FOLGA!");
    		} else {
    			System.out.println("\nRELATORIO DE ATIVIDADES"+
    					"\nDescricao do relatorio:\n" + getDescricaoRelatorio() +
    					"\nFolga sera:\n" + getFolga());
    		}
    	}
    }
} 