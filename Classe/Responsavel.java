
//------------------------------ CLASSE RESPONSAVEL ------------------------------------
package Classes;

public class Responsavel {

//------------------------------ ATRIBUTOS ------------------------------------
    

	//Atributos da classe Responsavel
	private String nomePai;
	private int cpfPai;
	private int rgPai;
	private String telefonePai;
	private String emailPai;
	private String nomeMae;
	private int cpfMae;
	private int rgMae;
	private String telefoneMae;
	private String emailMae;
	private Aluno alunos[] = {};
	
//------------------------------ GET'S ------------------------------------
        
    //Gets dos Atributos
    public String getNomePai() {
        return nomePai;
    }

    public int getCpfPai() {
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

    public int getCpfMae() {
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

    public void setCpfPai(int cpfPai) {
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

    public void setCpfMae(int cpfMae) {
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
        
        
	//Construtor sobrecarregado para n�o haver instancias sem alguns dados importantes 
	public Responsavel(String nomePai, String telefonePai, String nomeMae, String telefoneMae) {
		this.nomePai = nomePai;
		this.telefonePai = telefonePai;
		this.nomeMae = nomeMae;
		this.telefoneMae = telefoneMae;
	}
	
	//Sem m�todo por enquanto
}
