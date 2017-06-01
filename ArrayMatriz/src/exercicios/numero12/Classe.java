/*
 * 
 * Criar um array do tipo boolean com 3 posições, com os valores true, false, true.
	Utilizando for, verifique se comparado todos os valores boleanos do array com o
	operador ou (|) é verdadeiro, caso sim imprima “1”, caso contrário “2”.
 * 
 */
package exercicios.numero12;

public class Classe {
	
	public static void main(String[] args) {
		
		boolean[] arrayBoolean = new boolean[3];
		
		arrayBoolean[0] = true;
		arrayBoolean[1] = false;
		arrayBoolean[2] = true;
		boolean todosVerdadeiros = true;
		
		for ( int aux = 0; aux < arrayBoolean.length; aux++ ){
			
			for ( int aux2 = 0; aux2 < arrayBoolean.length; aux2++){
				
				if ( aux != aux2 && !(arrayBoolean[aux] || arrayBoolean[aux2])){
					todosVerdadeiros = false;
				}				
				
			}
		}
		
		if (todosVerdadeiros){
			System.out.println("1");
		}else{
			System.out.println("2");
		}
			
	}

}
