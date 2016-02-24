package VerificarNotasAluno;

import java.util.Scanner;

public class NotasAluno {

	public static void main (String...arg){
		
		Float np1;
		Float np2;
		Integer media;
		
//		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		np1 = entrada.nextFloat();
		System.out.println("Digite a segunda nota");
		np2 = entrada.nextFloat();
		
		media = (int) ((np1 + np2)/2);
		
		if (media >= 7){
			System.out.println("Aprovado, sua média é: "+media);
		} else{
			if (media >= 4){
				media = 10 - media;
				System.out.println("Está de final, estude um pouco mais,"
						+ "você precisa estudar com a nota minima de "+media);
			}else{
				if (media < 4){
					System.out.println("reprovado, irá refazer a cadeira");
				}
			}
//			System.out.println("Reprovado, sua média é: "+ media);
		}

	}
}
