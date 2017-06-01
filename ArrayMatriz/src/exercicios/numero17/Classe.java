/*
 * 
 * Criar um array com 10 posições, com valores de 1 a 10 sequenciais. Criar um array
	de 5 posições. Popular o segundo array somente com os valores ímpares do
	primeiro array utilizando for. Imprimir o segundo array para verificar se o algoritmo
	funcionou.
 * 
 * 
 */

package exercicios.numero17;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[10];
		int[] array2 = new int[5];
		
		int posicao = 0;
		for ( int aux = 0; aux < array1.length; aux++ ){
			array1[aux] = aux+1;
			
			if ( array1[aux] % 2 != 0 ){
				array2[posicao] = array1[aux];
				posicao++;
			}
			
			System.out.print(" "+array1[aux]+" ");
		}
		
		System.out.println();
		
		for ( int aux = 0; aux < array2.length; aux++ ){
			System.out.print(" "+array2[aux]+" ");
			
		}
		
 	}

}
