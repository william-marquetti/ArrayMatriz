/*
 * Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.
	a. Imprimir todos os valores do array at� chegar a metade do array.
	b. Alterar o valor do in�cio do array para 10.
	c. Alterar o valor da �ltima posi��o do array para 10.
	d. Imprimir todos os valores do array.
 * 
 */

package exercicios.numero8.itema;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] arrayInt = new int[5];
		
		for ( int aux = 0; aux <= arrayInt.length-1; aux++ ){
			arrayInt[aux] = aux+1;
		}
	}
}
