/*
 * Crie um array com 10 posi��es e pe�a para o usu�rio digitar um n�mero e colocar
	este n�mero no array. Enquanto o array n�o tiver chego no final dever� sempre
	perguntar para o usu�rio um pr�ximo n�mero e inserir no array. Dever� ser utilizar
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