/*
 * Criar um array com os valores 1, 2, 3, 4, 5. Criar outro array com os valores 5, 4, 3,
	2, 1. Utilizando for, imprimir em qual � as posi��es dos arrays que o valor � s�o
	iguais, conforme exemplo abaixo:
	arrayA posi��o 0, arrayB posi��o 4 possuem o valor 1
	arrayA posi��o 1, arrayB posi��o 3 possuem o valor 2
 */
package exercicios.numero19;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] arrayA = new int[5];
		int[] arrayB = new int[5];
		
		int aux2 = arrayB.length;
		
		for (int aux = 0; aux < arrayA.length; aux++ ){
			arrayA[aux] = aux+1;
			System.out.println(arrayA[aux]);
		}
		
		for (int aux = 0; aux < arrayA.length; aux++ ){
			arrayB[aux] = aux2;
			aux2--;
			
			System.out.println(arrayB[aux]);
		}
		
		
		for ( int aux = 0; aux < arrayA.length; aux++ ){
			
			for (int aux3 = 0; aux3 < arrayA.length; aux3++ ){
				
				if (arrayA[aux] == arrayB[aux3]){
					System.out.println("arrayA posi��o "+ aux + ", arrayB posi��o "+ aux3 + " possuem o valor "+ arrayA[aux]);
				}
				
			}
		}
		
	}

}
