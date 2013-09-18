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
        
    //Gets dos Atributos
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

	//Metodo no qual e possivel modificar a graduacaoo informado pelo professor
	public void atualizarGraduacao (String graduacao) {
		this.setGraduacao(graduacao);
		
		System.out.println("O nome e-mail cadastrado e: " + this.getGraduacao());
	}
	
	//Metodo para exibicao de dados na tela
        public String toString(){
            return "\n Dados do Professor"
                    + "\n Código de Identificação: " + getCodigoIdentificacao()
                    + "\n Nome: " + getNome()
                    + "\n Graduação: " + getGraduacao()
                    + "\n Endereço: " + getEndereco()
                    + "\n Telefone: " + getTelefone()
                    + "\n E-mail: " + getEmail()
                    + "\n Disciplinas: " + getDisciplinas();
         }
}
