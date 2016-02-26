package ListadeExercicio;

import java.util.Scanner;

public class Questao09 {

	public static void main (String[]args){
		
		Scanner entrada = new Scanner(System.in);
		int p1;
		int p2;
		int p3;
		int mediaAritmetica;
		int mediaPonderada;
		int mediaHarmonica;
		int medPonderada1;
		int medPonderada2;
		int medPonderada3;
		int escolhaDoUsuario = 1;
		
		

		System.out.println("Informe o primeiro numero");
		p1 = entrada.nextInt();
		System.out.println("Informeo segundo numero");
		p2 = entrada.nextInt();
		System.out.println("Informe o terceiro numero");
		p3 = entrada.nextInt();
		
				switch (escolhaDoUsuario){
				case 1:
					System.out.println("[1] - Media aritmetica");
					break;
				case 2:
					System.out.println("[2] - Media Ponderada");
					break;
				case 3:
					System.out.println("[3] - Media Harmonica");
					break;
				default:
					System.out.println("Opção inválida");
//		}
		
//			
//		mediaAritmetica = (p1 + p2 + p3)/ 3;
//		mediaPonderada = p1 + p2 + p3;
//		
	}
	}
}
