package Tirangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		
		Double a;
		Double b;
		Double c;
		
		System.out.println("Digite o lado do trangulo A");
		a = entrada.nextDouble();
		System.out.println("Digite o lado do triangulo B");
		b = entrada.nextDouble();
		System.out.println("Digite o lado do triangulo C");
		c = entrada.nextDouble();
		
		Double triangulo = (Double) ((a + b + c)/3);
		
	}
	
}
