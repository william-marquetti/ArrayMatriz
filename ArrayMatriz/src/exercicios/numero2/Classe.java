/*
 * Criar um array do tipo boolean com 3 posições;
 */
package exercicios.numero2;

public class Classe {

	public static void main(String[] args) {
		
		boolean[] arrayBoolean = new boolean[3];
		
		for ( int aux = 0; aux < 3; aux++ ){
			if ( aux % 2 == 0 ){
				arrayBoolean[aux] = true;
			}else {
				arrayBoolean[aux] = false;
			}
			
			System.out.println(arrayBoolean[aux]);
		}
	}
}
