/*
 * Criar um array de char com os seguintes valores, ‘e’, ‘s’, ‘t’, ‘a’, ‘ ’, ‘a’, ‘c’, ‘a’, ‘b’, ‘a’,

	‘n’, ‘d’, ‘o’, ‘ ’, ‘a’, ‘ ’, ‘a’, ‘u’, ‘l’, ‘a’. Percorrer o array de char, e armazenar em uma
	
	String, para formar o seguinte texto, “esta acabando a aula”. Imprimir este texto no
	
	final com o valor da variável String.
 * 
 * 
 */
package exercicios.numero24;

public class Classe {
	
	public static void main(String[] args) {
		
		char[] letras =  "esta acabando a aula".toCharArray();
		String frase ="";
		
		for ( int aux = 0; aux < letras.length; aux++ ){
			frase += letras[aux];
		}
		
		System.out.println(frase);
	}
	
	
	

}
