package ListadeExercicio;

import java.util.Scanner;

public class Questao08 {
		
	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioMinimo = 890.00;
		double salarioFuncionario;
		
		System.out.println("Digite o salário total");
		salarioFuncionario = entrada.nextDouble();
		
		double quantidadeSalarioMinimo = salarioFuncionario / salarioMinimo;
		
		System.out.println("a quantidade de salários minimos que você recebe é de: "+quantidadeSalarioMinimo);
		
		
	}
}
