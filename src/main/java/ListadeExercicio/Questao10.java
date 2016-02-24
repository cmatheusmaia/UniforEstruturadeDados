//Faça um algoritmo para calcular quantas ferraduras são necessárias
//para equipar todos os cavalos comprados para um haras. 

package ListadeExercicio;

import java.util.Scanner;

public class Questao10 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		Integer qtdFerraduras;
		Integer qtdCavalos;
		
		System.out.println("Digite a quantidade de cavalos");
			qtdCavalos = entrada.nextInt();
		
		qtdFerraduras = qtdCavalos * 4;
		
		System.out.println("A quantidade de ferraduras para comprar é "+qtdFerraduras);
	}
	
}
