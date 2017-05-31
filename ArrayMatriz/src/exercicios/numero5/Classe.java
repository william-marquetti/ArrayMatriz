/*
 * Criar um array do tipo double, colocando os seguintes valores no array 1.0, 3.0, 5.0,
	7.0.
 * 
 * 
 */
package exercicios.numero5;

public class Classe {
	
	public static void main(String[] args) {
		
		double[] arrayDouble = new double[4];
		
		arrayDouble[0] = 1.0d;
		arrayDouble[1] = 3.0d;
		arrayDouble[2] = 5.0d;
		arrayDouble[3] = 7.0d;
		
		for ( int aux = 0; aux < arrayDouble.length; aux++ ){
			System.out.println(arrayDouble[aux]);
		}
	}
	
}
