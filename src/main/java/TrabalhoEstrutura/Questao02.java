// 2- solicita 2 palavras como entrada e verificar se são iguais
package TrabalhoEstrutura;

import java.util.Scanner;

public class Questao02 {
	public static void main (String...args){
		ChamarMetodos.AvisoAppQ2();
		String palavraUm;
		String palavraDois;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a palavra um");
		palavraUm = entrada.next();
		System.out.println("Informe a palavra dois");
		palavraDois = entrada.next();
		
		if(palavraUm.equals(palavraDois)){
			System.out.println("As palavras são iguais!");
		} else {
			System.out.println("As palavras não são iguais :-(");
		}
	}
}
