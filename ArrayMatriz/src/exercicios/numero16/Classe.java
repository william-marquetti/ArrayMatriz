/*
 * Criar um array com 10 posi��es. Inserir nas posi��es 2, 4, 5, 7 os respectivos
	valores �A�, �B�, �C�, �D�. Com for ou while, inserir a letra �W� nas posi��es do array
	no qual n�o tem valor (verificar a posi��o do array com null para validar se possui
	valor ou n�o na posi��o do array, array[i] == null). Imprimir o array para verificar se o
	algoritmo funcionou. Fazer o exerc�cio utilizando for ou while.
 * 
 */

package exercicios.numero16;

public class Classe {

		public static void main(String[] args) {
			
			String[] array1 = new String[10];
			
			array1[2] = "A";
			array1[4] = "B";
			array1[5] = "C";
			array1[7] = "D";
			
			for ( int aux = 0; aux < array1.length; aux ++ ){
				if ( array1[aux] == null){
					array1[aux] = "W";
				}
				
				System.out.println(array1[aux]);
			}
			
		}
}
