/*
 * 4 - solicitar um texto como entrada e mostrar como resultado o texto com todas
 * as palavras iniciadas por letras maiusculas e as demais minusculas
 * ex:
 * p1 = "aula de estruturas";
 * saida= "Aula De Estruturas";
 */

package TrabalhoEstrutura;

import java.util.Scanner;

public class Questao04 {
	public static void main (String[]args){
		
		ChamarMetodos.AvisoAppQ4();
		// variaveis
		Scanner entrada = new Scanner(System.in);
		String palavra;
		
		// console
		System.out.println("Informe a palavra");
		palavra = entrada.next();
		
		System.out.println(palavra + " transformada para: "+palavra.toUpperCase());
	}
}
