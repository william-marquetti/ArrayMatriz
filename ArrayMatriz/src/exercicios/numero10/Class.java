/*
 * Criar um array do tipo int de 6 posi��es, com os valores 1, 3, 5, 7, 9, 11. Imprimir
	todas as posi��es menos a �ltima posi��o (verificar se � a �ltima posi��es e n�o
	verificar se � o de valor 11).
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
