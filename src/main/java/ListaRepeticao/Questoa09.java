/*
 * 9.	O cardápio de uma lanchonete é o seguinte: 
 * Especificação 		Código 	Preço 
 * Cachorro quente 	100 		1,20 
 * Misto quente 		101 		1,30 
 * X-Egg-Bacon 		102 		2,50 
 * Hambúrger 		103 		1,20 
 * Cheeseburguer 	104 		1,30 
 * Refrigerante 		105 		1,00 
 * 
 * Escrever um algoritmo que leia o código do item pedido,
 * a quantidade e calcule o valor a ser pago por aquele lanche.
 * Faça com que o menu de escolha se
 */
package ListaRepeticao;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Questoa09 {
	
	public static void main(String...arg){
		
		Double p100 = 1.20;
		Double p101 = 1.30;
		Double p102 = 2.50;
		Double p103 = 1.20;
		Double p104 = 1.30;
		Double p105 = 1.00;
		Double valorAPagar;
		Integer quantidade;
		Integer escolhaDoUsuario;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seja bem vindo a Lanchonete");
		System.out.println("");
		System.out.println("Segue cardápio: ");
		System.out.println("[CÓDIGO] Especificação - Preço");
		System.out.println();
		System.out.println("[ 100 ] Cachorro quente - R$"+p100);
		System.out.println("[ 101 ] Misto quente - R$"+p101);
		System.out.println("[ 102 ] X-Egg-Bacon - R$"+p102);
		System.out.println("[ 103 ] Hambúrger - 103 | R$"+p103);
		System.out.println("[ 104 ] Cheeseburguer - R$"+p104);
		System.out.println("[ 105 ] Refrigerante -  R$"+105);
		System.out.println();
		escolhaDoUsuario = entrada.nextInt();
		
		switch(escolhaDoUsuario){
		case 100:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p100;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;
		case 101:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p101;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;
		case 102:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p102;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;
		case 103:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p103;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;
		case 104:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p104;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;

		case 105:
			System.out.println("Informe a quantidade desejada");
			quantidade = entrada.nextInt();
			valorAPagar = quantidade * p105;
			System.out.println();
			System.out.println("O valor a ser pago é de: R$"+valorAPagar);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		
	}
}
