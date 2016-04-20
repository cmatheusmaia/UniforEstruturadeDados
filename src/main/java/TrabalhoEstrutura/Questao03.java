// 3- solicitar como entrada duas palavras e comentar a 1°, com a 2° em uma outra string
package TrabalhoEstrutura;

import java.util.Scanner;

public class Questao03 {
	public static void main(String...args){
		ChamarMetodos.AvisoAppQ3();
		String palavraUm;
		String palavraDois;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a palavra um");
		palavraUm = entrada.next();
		System.out.println("Informe a palavra dois");
		palavraDois = entrada.next();
		
		String palavraComentada = palavraUm + " " + palavraDois;
		System.out.println(palavraComentada);
		
		
	}
}
