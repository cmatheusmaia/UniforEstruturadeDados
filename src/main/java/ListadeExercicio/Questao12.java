//Escreva um algoritmo para ler o nome e a idade
//de uma pessoa, e exibir quantos dias de vida
//ela possui. Considere sempre anos completos,
//e que um ano possui 365 dias. Ex: uma pessoa
//com 19 anos possui 6935 dias de vida; veja um
//exemplo de saída: JOSÉ, VOCÊ JÁ VIVEU 6935 DIAS. 

package ListadeExercicio;

import java.util.Scanner;

public class Questao12 {
	
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
