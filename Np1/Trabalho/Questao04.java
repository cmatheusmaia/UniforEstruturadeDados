package Trabalho;

import java.util.Scanner;

public class Questao04 {
	
	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		Integer idade;
		Integer ano = 365;
		String nome;
		Integer resultado;
		
		System.out.println("Digite o nome da pessoa");
			nome = entrada.next();
		System.out.println(nome+" agora digite sua idade");
			idade = entrada.nextInt();
		
		resultado = idade * ano;
		
		System.out.println(nome+" você já viveu "+resultado);
		
	}

}