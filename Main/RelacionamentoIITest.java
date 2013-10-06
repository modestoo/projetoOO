package Main;

//Importacao das classes para utilizacao
import Classes.Direcao;
import Classes.Secretaria;

//Teste do segundo relacionamento. Classes: Direcao - Secretaria
public class RelacionamentoIITest {

    //Construtor da classe com seus parametros vazios
    public RelacionamentoIITest() {
    }
        
    public static void main(String[] args) {
        Direcao direcao1 = new Direcao();
        direcao1.setDiretor("Diretor1");
        direcao1.setCoordenador("Coordenador1");
        direcao1.setPsicopedagogo("Psicopedagogo1");
        direcao1.setOrientador("Orientador1");
        
        Secretaria secretaria1 = new Secretaria("Secretaria1", 123, "Sec", "1234-4321");
        
        direcao1.criarSecretaria(secretaria1);
        
    }
}
