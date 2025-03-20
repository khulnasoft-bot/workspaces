/* na interface eu terei APENAS uma lista de cabe�alhos de m�todos
 * o prop�sito � definir QUAIS funcionalidades meu sistema exige
 * 
 * em outras palavras, a interface define as "cl�usulas contratuais" que uma classe deve
 * cumprir, ou seja, implementar (escrever l�gica)
 *
 */

public interface InterfaceBD {
	public void conectar();
	public void executar(String comando);
	public void desconectar();
}
