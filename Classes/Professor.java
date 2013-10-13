//------------------------------ CLASSE PROFESSOR ------------------------------------
package Classes;

public class Professor extends Funcionario {

//------------------------------ ATRIBUTOS ------------------------------------
    
	//Atributos da classe Professor
	private String especializacao;
	private String horarioDeAula;
	private Disciplina disciplinas[] = {};
	private Sala sala;
	private String conteudoMinistrado;
    private Graduacao graduacao;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos  

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public String getEspecializacao() {
		return especializacao;
	}

	public String getHorarioDeAula() {
		return horarioDeAula;
	}

	public Sala getSala() {
        return sala;
    }
	
	public String getConteudoMinistrado(){
		return conteudoMinistrado;
	}
	
	public Graduacao getGraduacao() {
		return graduacao;
	}
    
    
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos  

	public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public void setEspecializacao(String especializacao) {
    	this.especializacao = especializacao;
    }
    
    public void setConteudoMinistrado(String conteudoMinistrado){
    	this.conteudoMinistrado = conteudoMinistrado;
    }

    public void setHorarioDeAula(String horarioDeAula) {
    	this.horarioDeAula = horarioDeAula;
    }
    
    public void setGraduacao(Graduacao graduacao) {
		this.graduacao = graduacao;
	}
          
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
   

	//Construtor sem sobrecarga (vazio)
	public Professor(String nome, int codigoIdentificacao, String funcao, String telefone) {
		
		//Usando Construtor da Classe Pai
		super (nome, codigoIdentificacao, funcao, telefone);
		Graduacao graduacao = new Graduacao(this);
        this.graduacao = graduacao;
	}
        

    //Metodo para conter os numeros adicionados no vetor
	public void adicionarDisciplina(Disciplina disciplina) {
		int tamanhoAnterior = this.getDisciplinas().length;
		if(tamanhoAnterior-1 >= 10) {
			System.out.println("Nao e permitido adicionar mais do que 10 disciplinas.");
		} else {
			Disciplina[] novasDisciplinas = new Disciplina [tamanhoAnterior];
			for(int j=0; j < tamanhoAnterior; j++) {
				novasDisciplinas[j] = this.getDisciplinas()[j];
			}
			novasDisciplinas[novasDisciplinas.length-1] = disciplina;
			this.setDisciplinas(novasDisciplinas);
		}
	}
	

	//Metodo que permite criar uma graduacao
    public void criarGraduacao(Graduacao graduacao){
    	this.graduacao = graduacao;
    }
    
    
    //Metodo que resgistra conteudo ministrado na auala
    public void cadastrarConteudoMinistrado (String conteudoMinistrado){
    	this.conteudoMinistrado = conteudoMinistrado;
    }
    
    
    //Metodo com polimorfismo para constar presenta no trabalho
    public void baterPonto() {
    	
    	//Aqui nao sera possivel o professor bater ponto se nao tiver chamando o metodo cadastrarConteudoMinistrado
    	if (conteudoMinistrado == null){
    		System.out.println("Voce precisa registrar o conteudo ministrado antes de bater o ponto!");
    	} else {
    		setPresenca(true);
    		isPresenca();
    		System.out.println("E o conteudo ministrado pelo professor " + getNome() + " foi: " + getConteudoMinistrado());
    	}
    }
}
