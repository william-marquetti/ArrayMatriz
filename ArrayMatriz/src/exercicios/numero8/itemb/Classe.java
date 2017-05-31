/*
 * Criar um array do tipo int de 6 posições. Criar um for para popular o array com os
	valores 0, 1, 2, 3, 4, 5.
 * 
 */

package exercicios.numero8.itemb;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] arrayInt = new int[6];
		
		for ( int aux = 0; aux <= arrayInt.length-1; aux++ ){
			arrayInt[aux] = aux;
			System.out.println(arrayInt[aux]);
		}		
		
	}
}