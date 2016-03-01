package ListadeExercicio;

import java.util.Scanner;

public class Questao09I {

	public static void main(String...arg){
		
		Scanner entrada = new Scanner (System.in);
		
		Double dimensaoA;
		Double dimensaoB;
		Double calcularAreaTerreno;
		
		System.out.println("Informe a dimensão A");
		dimensaoA = entrada.nextDouble();
		System.out.println("Informe a dimensão B");
		dimensaoB = entrada.nextDouble();
		
		calcularAreaTerreno = (dimensaoA + dimensaoB) * 2;
		System.out.println(calcularAreaTerreno);
		
		
	}
	
}
