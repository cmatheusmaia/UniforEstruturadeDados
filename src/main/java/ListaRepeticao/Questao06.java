/*
 * 6.	Solicite como entrada um número N referente ao total de notas fiscais.
 * Solicite N valores referentes as notas fiscais e mostre como resultado se o
 * total atingiu ou não as metas de vendas, onde metas são: Meta 1 maior ou igual
 * a R$ 5.000,0 e Meta 2 maior ou igual a R$ 15.000,00 reais. 
 */

package ListaRepeticao;

import java.util.Scanner;

public class Questao06 {

	public static void main(String...args){
	
	Integer quantidadeNotas;
	Integer i = 0;
	Double valorNotas = null;
	Scanner entrada = new Scanner(System.in);
	Double meta1 = 5.000;
	Double meta2 = 15.000;
	
	System.out.println("Informe a quantidade de notas fiscais");
	quantidadeNotas = entrada.nextInt();
	
	for(i = 0; i< quantidadeNotas; i++){
		System.out.println("Informe o valor da NF");
		valorNotas = entrada.nextDouble();
		}
	if(valorNotas < meta1){
		System.out.println("Você não atingiu a meta de 5.000");
	}else{
		if ((valorNotas >= meta1) && (valorNotas <=meta2)){
			System.out.println("Você atingiu a meta 1 de 5.000");
		}else{
			if(valorNotas >=meta2){
				System.out.println("Você atingiu a meta 2 de 15.000");
			}
			
		}
	}
	}
}
