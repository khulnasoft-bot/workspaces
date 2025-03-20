/*
 *  J� que eu tenho uma classe abstrata, eu n�o posso dar NEW em objetos dela,
 *  por�m eu posso utiliz�-la de TEMPLATE  (com os requisitos estritamente essenciais
 *  que o meu tipo de dado precisa ter)
 * 
 * 
 * al�m disso eu posso EXIGIR que quem herdar dessa classe, compromete-se a escrever
 * a l�gica dos m�todos definidos (aqui na classe abstrata eu defino o 'O QUE'.. 
 * as classes filha definem o 'COMO'
 */
public abstract class Veiculo {
	String marca;
	String modelo;
	
	// aqui vem a especifica��o do O QUE
	public abstract void acelerar();
	public abstract void frear();	
}
