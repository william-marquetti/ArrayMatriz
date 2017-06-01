/*
 * Criar um array de 10 posições, e popular o array com os valores 1, 2, 3, 4, 5 a partir
	da posição 4 utilizando for. Para colocar os valores 1, 2, 3, 4, 5 utilizando uma
	variável.
 * 
 * 
 */
package exercicios.numero13;

public class Classe {

	public static void main(String[] args) {
		
		int[] arrayInt = new int[10];
		
		int numero = 1;
		
		for ( int aux = 0; aux < arrayInt.length; aux++ ){
			if(aux > 4){
				arrayInt[aux] = numero;
				numero++;
				
			}else {
				arrayInt[aux] = aux+1;
			}
			
			System.out.println(arrayInt[aux]);
			
		}
	}
}
