/*
 * Crie um array com 10 posições e peça para o usuário digitar um número e colocar
	este número no array. Enquanto o array não tiver chego no final deverá sempre
	perguntar para o usuário um próximo número e inserir no array. Deverá ser utilizar
	while ou for.
 * 
 * 
 */
package exercicios.numero21;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int aux = 0;
		
		while (aux < numeros.length){
		
			System.out.println("digite um numero");
			numeros[aux] = scanner.nextInt();
			aux++;
		}
		
		scanner.close();
	}

}