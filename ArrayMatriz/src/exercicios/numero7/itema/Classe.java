/*
 * Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
	a. Imprimir todos os valores do array
	b. Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”,
	
	“C”, “B”, “A”
	c. Imprimir todos os valores do array menos que tenha o valor “C”
 * 
 * 
 */
package exercicios.numero7.itema;

public class Classe {
	public static void main(String[] args) {
		
		String[] arrayString = new String[10];
		
		int posicao = 0; 
		
		for ( char letra = 'A'; letra <= 'F'; letra++){
			
			arrayString[posicao] = Character.toString(letra);
			System.out.println(arrayString[posicao]);
			posicao++;
			
			
		}
	}
}