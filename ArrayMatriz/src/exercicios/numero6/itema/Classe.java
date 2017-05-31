/*
 * Criar um array do tipo int, com valores de 0 à 5.
		a. Imprimir todos os valores do array
		b. Imprimir todos os valores do array de forma decrescente
 * 
 * 
 */
package exercicios.numero6.itema;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] arrayInt = new int[6];
		
		for ( int aux = 0; aux < arrayInt.length; aux++ ){
			arrayInt[aux] = aux;
			
			System.out.println(arrayInt[aux]);
		}
	}

}
