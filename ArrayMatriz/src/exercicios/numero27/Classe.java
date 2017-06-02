/*
 * 
 * 27. Conforme os moldes do exercício 31 e 32 seguindo os mesmos padrões, só que

		agora somar os valores conforme exemplos abaixo:
		
		a. 3 2 3
		
		2 2 3
		
		1 1 2
		
		Soma dos número ímpares da linha 0: 6
		
		Soma dos números pares da linha 0: 2
		
		Soma dos número ímpares da linha 1: 3
		
		
		Soma dos números pares da linha 1: 4
		
		Soma dos número ímpares da linha 2: 2
		
		Soma dos números pares da linha 2: 2
 * 
 * 
 */

package exercicios.numero27;

public class Classe {
	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		matriz[0][0] = 3;
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 3;

		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 2;

		int somaPar = 0;
		int somaImpar = 0;

		// aux = utilizado para controlar a linha
		for (int aux = 0; aux < matriz.length; aux++) {

			// aux2 = utilizado para controlar a coluna
			for (int aux2 = 0; aux2 < matriz.length; aux2++) {
				if (matriz[aux][aux2] % 2 != 0) {
					somaImpar = somaImpar + matriz[aux][aux2];

					if (aux2 == matriz.length - 1) {
						System.out.println("Soma dos número ímpares da linha " + aux + ": " + somaImpar);

					}
				}

			}

			somaImpar = 0;

		}
		
		// aux = utilizado para controlar a linha
		for (int aux = 0; aux < matriz.length; aux++) {

			// aux2 = utilizado para controlar a coluna
			for (int aux2 = 0; aux2 < matriz.length; aux2++) {
				if (matriz[aux][aux2] % 2 == 0) {
					somaPar = somaPar + matriz[aux][aux2];

					if (aux2 == matriz.length - 1) {
						System.out.println("Soma dos número pares da linha " + aux + ": " + somaPar);

					}
				}

			}

			somaPar = 0;

		}
	}

}