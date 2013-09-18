
//------------------------------ CLASSE PROFESSOR ------------------------------------
package Classes;

public class Professor {

//------------------------------ ATRIBUTOS ------------------------------------
    
	//Atributos da classe Professor
	private String nome;
	private int codigoIdentificacao;
	private String graduacao;
	private String endereco;
	private String telefone;
	private String email;
	private Disciplina disciplinas[] = {};
	private Sala sala;
	
//------------------------------ GET'S ------------------------------------
        
    //Gets e Sets das classes
    public String getNome() {
        return nome;
    }

    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public Sala getSala() {
        return sala;
    }
    
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoIdentificacao(int codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
          
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
        //Construtor sem sobrecarga (vazio)
	public Professor() {
            
	}

        //M�todo para conter os n�meros adicionados no vetor
	public void adicionarDisciplina(Disciplina disciplina) {
		int tamanhoAnterior = this.getDisciplinas().length;
		if(tamanhoAnterior-1 >= 10) {
			System.out.println("N�o � permitido adicionar mais do que 10 disciplinas.");
		} else {
			Disciplina[] novasDisciplinas = new Disciplina [tamanhoAnterior];
			for(int j=0; j < tamanhoAnterior; j++) {
				novasDisciplinas[j] = this.getDisciplinas()[j];
			}
			novasDisciplinas[novasDisciplinas.length-1] = disciplina;
			this.setDisciplinas(novasDisciplinas);
		}
	}

	//Metodo no qual � possivel modificar a gradua��o informado pelo professor
	public void atualizarGraduacao (String graduacao) {
		this.setGraduacao(graduacao);
		
		System.out.println("O nome e-mail cadastrado �: " + this.getGraduacao());
	}
}