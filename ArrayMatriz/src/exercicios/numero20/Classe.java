/*
 * Crie um array int com 3 posi��es e pe�a para o usu�rio digitar um valor, e insira o
	valor na primeira posi��o do array, pe�a para o usu�rio digitar outro valor e insira o
	valor na segunda posi��o do array, pe�a para o usu�rio digitar outro valor e insira o
	valor terceira prosi��o do array.
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
