//------------------------------ CLASSE RESPONSAVEL ------------------------------------
package Classes;

public class Responsavel {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Responsavel
	private String nomePai;
	private String cpfPai;
	private int rgPai;
	private String telefonePai;
	private String emailPai;
	private String nomeMae;
	private String cpfMae;
	private int rgMae;
	private String telefoneMae;
	private String emailMae;
	private Aluno alunos[] = {};
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getNomePai() {
        return nomePai;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public int getRgPai() {
        return rgPai;
    }

    public String getTelefonePai() {
        return telefonePai;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public int getRgMae() {
        return rgMae;
    }

    public String getTelefoneMae() {
        return telefoneMae;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
        
//------------------------------ SET'S ------------------------------------
        
    //Sets dos Atributos
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public void setRgPai(int rgPai) {
        this.rgPai = rgPai;
    }

    public void setTelefonePai(String telefonePai) {
        this.telefonePai = telefonePai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public void setRgMae(int rgMae) {
        this.rgMae = rgMae;
    }

    public void setTelefoneMae(String telefoneMae) {
        this.telefoneMae = telefoneMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
  
//------------------------------ METODOS E CONSTRUTORES ------------------------------------
        
        
	//Construtor sobrecarregado para nao haver instancias sem alguns dados importantes 
	public Responsavel(String nomePai, String telefonePai, String nomeMae, String telefoneMae) {
		this.nomePai = nomePai;
		this.telefonePai = telefonePai;
		this.nomeMae = nomeMae;
		this.telefoneMae = telefoneMae;
	}
	
	//Metodo para conter os numeros adicionados no vetor
        public void adicionarAluno(Aluno aluno) {
		int tamanhoAnterior = this.getAlunos().length;
		if(tamanhoAnterior-1 >= 10) {
			System.out.println("Nao e permitido adicionar mais do que 10 alunos.");
		} else {
			Aluno[] novosAlunos = new Aluno [tamanhoAnterior];
			for(int j=0; j < tamanhoAnterior; j++) {
				novosAlunos[j] = this.getAlunos()[j];
			}
			novosAlunos[novosAlunos.length-1] = aluno;
			this.setAlunos(novosAlunos);
		}
	}
	
	//Metodo no qual e possivel cadatrar os dados do PAI do Aluno
	public void cadastrarPai(String nomePai, String cpfPai, int rgPai, String telefonePai, String emailPai) {
		this.nomePai = nomePai;
		this.cpfPai = cpfPai;
		this.rgPai = rgPai;
		this.telefonePai = telefonePai;
		this.emailPai = emailPai;
		
		if (nomePai == this.nomePai && emailPai == this.emailPai) {
			System.out.println("\n Dados do PAI cadastrados!");
		} else {
			System.out.println("\n Nao foi possivel cadastrar os dados. Tente novamente!");
		}
	}
	
	//Metodo no qual e possivel cadatrar os dados da MAE do Aluno
	public void cadastrarMae(String nomeMae, String cpfMae, int rgMae, String telefoneMae, String emailMae) {
		this.nomeMae = nomeMae;
		this.cpfMae = cpfMae;
		this.rgMae = rgMae;
		this.telefoneMae = telefoneMae;
		this.emailMae = emailMae;
			
		if (nomeMae == this.nomeMae && emailMae == this.emailMae) {
			System.out.println("\n Dados da MAE cadastrados!");
		} else {
			System.out.println("\n Nao foi possivel cadastrar os dados. Tente novamente!");
		}
	}
	
	//Metodo para exibicao de dados na tela
        public String toString(){
            return "\n Dados do Responsavel"
                    + "\n Nome Pai: " + getNomePai()
                    + "\n Telefone Pai: " + getTelefonePai()
                    + "\n E-mail Pai: " + getEmailPai()
                    + "\n Nome Mãe: " + getNomeMae()
                    + "\n Telefone Mãe: " + getTelefoneMae()
                    + "\n E-mail Mãe: " + getEmailMae()
                    + "\n Responsáveis por: " + getAlunos();
        }
}
