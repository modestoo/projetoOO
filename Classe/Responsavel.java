package Classes;

public class Responsavel {

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
	
	//Gets e Sets das classes
	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public int getCpfPai() {
		return cpfPai;
	}

	public void setCpfPai(int cpfPai) {
		this.cpfPai = cpfPai;
	}

	public int getRgPai() {
		return rgPai;
	}

	public void setRgPai(int rgPai) {
		this.rgPai = rgPai;
	}

	public String getTelefonePai() {
		return telefonePai;
	}

	public void setTelefonePai(String telefonePai) {
		this.telefonePai = telefonePai;
	}

	public String getEmailPai() {
		return emailPai;
	}

	public void setEmailPai(String emailPai) {
		this.emailPai = emailPai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public int getCpfMae() {
		return cpfMae;
	}

	public void setCpfMae(int cpfMae) {
		this.cpfMae = cpfMae;
	}

	public int getRgMae() {
		return rgMae;
	}

	public void setRgMae(int rgMae) {
		this.rgMae = rgMae;
	}

	public String getTelefoneMae() {
		return telefoneMae;
	}

	public void setTelefoneMae(String telefoneMae) {
		this.telefoneMae = telefoneMae;
	}

	public String getEmailMae() {
		return emailMae;
	}

	public void setEmailMae(String emailMae) {
		this.emailMae = emailMae;
	}

	//Construtor sobrecarregado para não haver instancias sem alguns dados importantes 
	public Responsavel(String nomePai, String telefonePai, String nomeMae, String telefoneMae) {
		this.nomePai = nomePai;
		this.telefonePai = telefonePai;
		this.nomeMae = nomeMae;
		this.telefoneMae = telefoneMae;
	}

}
