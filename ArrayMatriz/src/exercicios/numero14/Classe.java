/*
 * 
 * Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção.
	Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores
	presentes no primeiro array e inserir no segundo array. Desta forma os dois arrays
	terão os mesmo valores nas mesmas posições. Imprimir o segundo array para
	verificar se o algoritmo funcionou.
 * 
 */
package exercicios.numero14;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		int[] array2 = new int[array1.length];
		
		int valores = 10;
		
		for ( int aux = 0; aux < array1.length; aux ++ ){
			array1[aux] = valores;
			valores = valores - 2;
			
			System.out.print(" "+array1[aux]+ " ");
			
		}
		
		System.out.println();
		
		for ( int aux = 0; aux < array1.length; aux++) {
			array2[aux] = array1[aux];
			
			System.out.print(" "+array2[aux]+ " ");
		}
		
	}
}
