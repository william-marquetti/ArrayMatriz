/*
 * Crie um array de 5 posições com os valores 1, 3, 5, 7, 9. Peça para o usuário digitar
	um valor. Se o valor digitado pelo usuário estiver no array, imprima “Achei o valor”,
	caso contrário, não achei o valor. (o System.out.println deve estar fora do for).
 * 
 */
package exercicios.numero22;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int digitado;
		
		boolean encontrado = false;
		
		numeros[0] = 1;
		numeros[1] = 3;
		numeros[2] = 5;
		numeros[3] = 7;
		numeros[4] = 9;

		System.out.println("Digite um número");
		digitado = Integer.parseInt(scanner.nextLine());
		
		int aux = 0;
		
		while ( (encontrado == false) && aux < numeros.length ){
			if (numeros[aux] == digitado){
				encontrado = true;
			}
			
			aux++;
		}
				
		if (encontrado){
			System.out.println("Achei o valor");
		}else {
			System.out.println("Não achei o valor");
		}
		
		scanner.close();
	}

}
