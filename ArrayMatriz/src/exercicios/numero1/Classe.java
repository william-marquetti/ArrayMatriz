/*
 * Criar um array do tipo String com 10 posições;
 * 
 */
package exercicios.numero1;

public class Classe {
	public static void main(String[] args) {
		
		String[] arrayString = new String[10];
		
		int posicao = 0; 
		
		for ( char letra = 'A'; letra <= 'J'; letra++){
			
			arrayString[posicao] = Character.toString(letra);
			System.out.println(arrayString[posicao]);
			posicao++;
			
			
		}
	}
}
