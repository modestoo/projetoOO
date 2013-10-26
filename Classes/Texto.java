//------------------------------ CLASSE TEXTO ------------------------------------
package Classes;

public class Texto {
	
//------------------------------ METODOS E CONSTRUTORES ------------------------------------

	//Construtor vazio
	public Texto() {
		
	}

	//Metodo que permite escrever e enviar uma mensagem
	public void enviarTexto(String conteudoDoTexto, String remetente, String[] destinatarios){
		for (int i = 0; i < destinatarios.length; i++){
			System.out.println(destinatarios[i] + ", " + "há uma mensagem do(a): " + remetente + " :\n" + conteudoDoTexto);
		}
	}
	

}
