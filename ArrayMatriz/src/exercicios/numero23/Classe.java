/*
 * Crie um array de 6 posi��es com os valores 1, 2, 3, 4, 5, 6. Percorra o array
	procurando um valor par, se encontado deve ser perguntado para o usu�rio um novo
	valor para substituir o valor presente no array.
 */
package exercicios.numero23;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[6];

		for ( int aux = 0; aux < numeros.length; aux++ ){
			numeros[aux] = aux+1;
			System.out.print(" "+ numeros[aux]);
		}
		
		System.out.println();
		
		for ( int aux = 0; aux < numeros.length; aux++ ){
			
			if ( numeros[aux] % 2 == 0 ){
				System.out.println("A posi��o " + aux + " possui um n�mero par (" + numeros[aux] + ") informe outro n�mero para substitui��o.");
				numeros[aux] = Integer.parseInt(scanner.nextLine());
				
			}	
		}
		
		System.out.println("Array alterado");
		
		for ( int aux = 0; aux < numeros.length; aux++ ){
			System.out.print(" "+ numeros[aux]);
			
		}
		
			
		scanner.close();
	}

}