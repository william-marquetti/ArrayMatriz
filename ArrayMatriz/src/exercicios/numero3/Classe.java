/*
 * Criar um array do tipo int com 5 posições;
 * 
 */

package exercicios.numero3;

public class Classe {
	public static void main(String[] args) {
		
		int[] arrayInt = new int[5];
		
		int calculo = 0;
		
		for ( int aux = 0; aux < arrayInt.length; aux++){
			
			calculo = calculo + aux;
			arrayInt[aux] = calculo;
			
			System.out.println(arrayInt[aux]);
		}
	}

}
