
//------------------------------ CLASSE ALUNO ------------------------------------
package Classes;

public class Aluno {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Aluno
	private int matricula;
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String email;
	private String serie;
	private Responsavel responsavel;
	private Disciplina disciplinas[] = {};
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getSerie() {
        return serie;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    	
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
  
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
       
        
        //Construtor sobrecarregado para n�o haver instancias sem alguns dados importantes 
	public Aluno(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco; 	
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
        
	//Metodo no qual ser� poss�vel matricular novos alunos
	public void matricularAluno(int matricula, String nome, String dataNascimento,
			String endereco, String email, String serie ) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setEndereco(endereco);
		this.setEmail(email);
		this.setSerie(serie);
		System.out.println("Dados cadastrados!");
	}
}