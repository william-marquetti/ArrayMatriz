/*
 * Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
	a. Imprimir todos os valores do array
	b. Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”,
	
	“C”, “B”, “A”
	c. Imprimir todos os valores do array menos que tenha o valor “C”
 * 
 * 
 */
package exercicios.numero7.itemc;

public class Classe {
	public static void main(String[] args) {

		String[] arrayString = new String[6];

		arrayString[0] = "A";
		arrayString[1] = "B";
		arrayString[2] = "C";
		arrayString[3] = "D";
		arrayString[4] = "E";
		arrayString[5] = "F";

		for (int aux = 0; aux < arrayString.length; aux++) {

			if (arrayString[aux] != "C") {
				System.out.println(arrayString[aux]);
			}

		}

	}
}