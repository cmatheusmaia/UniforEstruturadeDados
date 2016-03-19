/*
 * 2.	Imprima uma PA, onde são fornecidos o primeiro termo,
 * a razão e a quantidade de termos desejada. 
 */
package ListaRepeticao;

import java.util.Scanner;

public class Questao02 {
	public static void main(String...arg){
		Integer termo;
		Integer razao;
		Integer n = null;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de termo");
		termo = entrada.nextInt();
		System.out.println("Informe a quantidade da razão");
		razao = entrada.nextInt();
		
		n = termo + (n - 1)*razao;
		System.out.println(n);
	}
}
