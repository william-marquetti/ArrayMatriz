/*
 * Criar um array do tipo boolean de 6 posi��es. Utilizando um for, popular o array
	aonde as posi��es forem pares colocar o valor true, e nas posi��es �mpares o valor
	false.
 * 
 */
package exercicios.numero11;

public class Classe {

	public static void main(String[] args) {
		
		boolean[] arrayBoolean = new boolean[6];
		
		for ( int aux = 0; aux <= arrayBoolean.length-1; aux++ ){
			if ( aux % 2 == 0 ){
				arrayBoolean[aux] = true;
			}else {
				arrayBoolean[aux] = false;
			}
			
			System.out.println(arrayBoolean[aux]);
		}
	}
}