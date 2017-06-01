/*
 * Crie um array int com 3 posições e peça para o usuário digitar um valor, e insira o
	valor na primeira posição do array, peça para o usuário digitar outro valor e insira o
	valor na segunda posição do array, peça para o usuário digitar outro valor e insira o
	valor terceira prosição do array.
 * 
 * 
 */
package exercicios.numero20;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		for ( int aux = 0; aux < numeros.length; aux++ ){
			System.out.println("digite um numero");
			numeros[aux] = scanner.nextInt();
		}
		
		scanner.close();
	}

}
