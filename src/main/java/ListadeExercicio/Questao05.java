//Dado o raio de um círculo, calcule o perímetro (2πr) e a área (πr²).

package ListadeExercicio;

import java.util.Scanner;

public class Questao05 {
	
	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		Integer raio;
		Integer perimetro;
		Integer area;
		
		System.out.println("Digite o raio do circulo");
		raio = entrada.nextInt();
		
		Integer n1 = (int) ((raio * 3.14) *2);
		
		System.out.println(n1);
		
	}

}
