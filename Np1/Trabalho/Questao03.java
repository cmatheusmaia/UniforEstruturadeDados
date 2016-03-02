package Trabalho;

import java.util.Scanner;

public class Questao03 {

	public static void main (String...arg){
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("informe o valor de n1");
		n1 = entrada.nextInt();
		System.out.println("informe o valor de n2");
		n2 = entrada.nextInt();
		System.out.println("Informe o valor de n3");
		n3 = entrada.nextInt();
		
		if ((n1 + n2 > n3) && (n1 + n3 > n2) && (n2 + n3 > n1)){
			System.out.println("ótimo, forma um triangulo, informe agora a base");
			double base = entrada.nextDouble();
			System.out.println("Agora informe a altura");
			double altura = entrada.nextDouble();			
			double area = (base * altura)/2;
			
			System.out.println("A área desse triangulo é "+area);
		} else {
			System.out.println("os valores não formam um triangulo");
		}
	}
}
