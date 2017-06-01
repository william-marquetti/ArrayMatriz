/*
 * Criar um array do tipo int de 6 posições, com os valores 1, 3, 5, 7, 9, 11. Imprimir
	todas as posições menos a última posição (verificar se é a última posições e não
	verificar se é o de valor 11).
 * 
 */
package exercicios.numero10;

public class Class {
	
	public static void main(String[] args) {
		
		int soma = 1;
		
		int[] arrayInt = new int[6];
		
		for ( int aux = 0; aux <= arrayInt.length-1 ; aux++ ){
			
			arrayInt[aux] = soma;
			
			if ( aux != (arrayInt.length-1)){
				System.out.println(arrayInt[aux]);
			}
			
			soma = (soma+2);
		}
	}

}
