/*
 * 
 Popular uma matriz da forma de que se impressa gere o códigos seguintes. Para

		imprimir a matriz utilizar o código abaixo:
		
		for (int linhas = 0; linhas &lt; matriz.length; linhas++) {
		
		for (int colunas = 0; colunas &lt; matriz[linhas].length; colunas++) {
		
		System.out.print(matriz[linhas][colunas]);
		
		}
		
		System.out.println();
		
		}
 a) (4x4)
	xxxx
	x  x
	x  x
	xxxx 
 
 b) (6x4)
 	xxxx
 	xxxx
	x  x
	x  x
	xxxx
	xxxx
 
 c)
 	(7 x 5)
 	xxxxx
 	x   x
 	x   x
 	xxxxx
 	x   x
 	x   x
 	xxxxx
 
 * 
 * 
 */
package exercicios.numero28;

public class Classe {

	public static void main(String[] args) {

		char[][] matrizA = new char[4][4];

		matrizA[0][0] = 'x';
		matrizA[0][1] = 'x';
		matrizA[0][2] = 'x';
		matrizA[0][3] = 'x';

		matrizA[1][0] = 'x';
		matrizA[1][1] = ' ';
		matrizA[1][2] = ' ';
		matrizA[1][3] = 'x';

		matrizA[2][0] = 'x';
		matrizA[2][1] = ' ';
		matrizA[2][2] = ' ';
		matrizA[2][3] = 'x';

		matrizA[3][0] = 'x';
		matrizA[3][1] = 'x';
		matrizA[3][2] = 'x';
		matrizA[3][3] = 'x';

		System.out.println("________________________________");
		System.out.println("Matriz A");
		System.out.println("________________________________");
		for (int linhas = 0; linhas < matrizA.length; linhas++) {

			for (int colunas = 0; colunas < matrizA[linhas].length; colunas++) {

				System.out.print(matrizA[linhas][colunas]);

			}

			System.out.println();

		}
		
		System.out.println("________________________________");
		
		char[][] matrizB = new char[6][4];

		matrizB[0][0] = 'x';
		matrizB[0][1] = 'x';
		matrizB[0][2] = 'x';
		matrizB[0][3] = 'x';

		matrizB[1][0] = 'x';
		matrizB[1][1] = 'x';
		matrizB[1][2] = 'x';
		matrizB[1][3] = 'x';

		matrizB[2][0] = 'x';
		matrizB[2][1] = ' ';
		matrizB[2][2] = ' ';
		matrizB[2][3] = 'x';
		
		matrizB[3][0] = 'x';
		matrizB[3][1] = ' ';
		matrizB[3][2] = ' ';
		matrizB[3][3] = 'x';

		matrizB[4][0] = 'x';
		matrizB[4][1] = 'x';
		matrizB[4][2] = 'x';
		matrizB[4][3] = 'x';
		
		matrizB[5][0] = 'x';
		matrizB[5][1] = 'x';
		matrizB[5][2] = 'x';
		matrizB[5][3] = 'x';

		System.out.println("Matriz B");
		System.out.println("________________________________");
		for (int linhas = 0; linhas < matrizB.length; linhas++) {

			for (int colunas = 0; colunas < matrizB[linhas].length; colunas++) {

				System.out.print(matrizB[linhas][colunas]);

			}

			System.out.println();

		}
		
	
		char[][] matrizC = new char[7][4];

		matrizC[0][0] = 'x';
		matrizC[0][1] = 'x';
		matrizC[0][2] = 'x';
		matrizC[0][3] = 'x';

		matrizC[1][0] = 'x';
		matrizC[1][1] = ' ';
		matrizC[1][2] = ' ';
		matrizC[1][3] = 'x';

		matrizC[2][0] = 'x';
		matrizC[2][1] = ' ';
		matrizC[2][2] = ' ';
		matrizC[2][3] = 'x';
		
		matrizC[3][0] = 'x';
		matrizC[3][1] = 'x';
		matrizC[3][2] = 'x';
		matrizC[3][3] = 'x';

		matrizC[4][0] = 'x';
		matrizC[4][1] = ' ';
		matrizC[4][2] = ' ';
		matrizC[4][3] = 'x';
		
		matrizC[5][0] = 'x';
		matrizC[5][1] = ' ';
		matrizC[5][2] = ' ';
		matrizC[5][3] = 'x';
		
		matrizC[6][0] = 'x';
		matrizC[6][1] = 'x';
		matrizC[6][2] = 'x';
		matrizC[6][3] = 'x';

		System.out.println("________________________________");
		System.out.println("Matriz C");
		System.out.println("________________________________");
		for (int linhas = 0; linhas < matrizC.length; linhas++) {

			for (int colunas = 0; colunas < matrizC[linhas].length; colunas++) {

				System.out.print(matrizC[linhas][colunas]);

			}

			System.out.println();

		}
		
		
	}

}
