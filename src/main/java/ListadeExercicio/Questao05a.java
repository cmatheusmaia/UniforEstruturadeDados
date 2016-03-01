package ListadeExercicio;

import java.util.Scanner;

public class Questao05a {

	public static void main (String...arg){
		
		float peso;
		float pesoFinal;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe"
				+ " seu peso");
		peso = entrada.nextFloat();
		
		pesoFinal = peso - (peso * 15/100) ;
		System.out.println("Quanto de peso você ficaria menos 15%: "+pesoFinal);
		pesoFinal = peso + (peso * 20/100);
		System.out.println("Quanto de peso você ficaria com mais 20%: "+pesoFinal);
	}
}
