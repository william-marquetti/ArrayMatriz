/*
 * Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
	a. Imprimir todos os valores do array
	b. Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”,
	
	“C”, “B”, “A”
	c. Imprimir todos os valores do array menos que tenha o valor “C”
 * 
 * 
 */
package exercicios.numero7.itemb;

public class Classe {
	public static void main(String[] args) {
		
		String[] arrayString = new String[6];
		
		int posicao = 0; 
		
		for ( char letra = 'A'; letra <= 'F'; letra++){
			
			arrayString[posicao] = String.valueOf(letra);
			posicao++;		
			
		}
		
		for ( int aux2 = arrayString.length-1; aux2 >= 0; aux2-- ){
			
			System.out.println(arrayString[aux2]);
		}
	}
}