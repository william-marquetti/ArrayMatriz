/*
 * Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6. Percorra o array
	procurando um valor par, se encontado deve ser perguntado para o usuário um novo
	valor para substituir o valor presente no array.
 */
package exercicios.numero23;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[6];

		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;

		for ( int aux = 0; aux < numeros.length; aux++ ){
			
			if ( numeros[aux] % 2 == 0 ){
				System.out.println("A posição " + aux + " possui um número par (" + numeros[aux] + ") informe outro número para substituição.");
				numeros[aux] = Integer.parseInt(scanner.nextLine());
				
			}	
		}
			
		scanner.close();
	}

}