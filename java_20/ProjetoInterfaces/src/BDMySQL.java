/* agora uma classe n�o EXTENDS uma interface, ela IMPLEMENTS uma interface
 * 
 * em outras palavras, uma CLASSE compromete-se a cumprir o contrato, escrevendo l�gica
 */
public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco MySQL");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do banco MySQL");
		
	}

}
