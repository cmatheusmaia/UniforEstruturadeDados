/*
 * 4.	Dado um número, imprimir a tabuada multiplicativa deste. 
 */
package ListaRepeticao;

import java.util.Scanner;

public class Questao04 {
	public static void main(String...arg){
		Integer tabuada;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe qual numero deseja tabuada");
		tabuada = entrada.nextInt();
		for (int i = 1; i <= 10; i++){
			System.out.println(tabuada+" x "+i+" = "+(tabuada*i));
		}
	}
}