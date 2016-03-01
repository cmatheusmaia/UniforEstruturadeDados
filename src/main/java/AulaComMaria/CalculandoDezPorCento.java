//Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da despesa de um cliente

package AulaComMaria;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CalculandoDezPorCento {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		float  contaCliente;
		System.out.println("Digite o valor da conta");
		contaCliente = entrada.nextFloat();
		
		contaCliente = contaCliente + (contaCliente* 3/100);
		System.out.println("Conta do Matheus"+contaCliente);
		
		contaCliente = contaCliente * 3/100; 
		System.out.println("Conta da Maria: "+contaCliente);
	}
	
}
