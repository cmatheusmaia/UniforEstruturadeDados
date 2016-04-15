package ExercicioAula;

import java.util.Scanner;

public class PalavaContrario {
	
	public static void main(String...args){
		String palavraC = null;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a palavra que deseja visualizar de forma contrário");
		palavraC = entrada.next();
		palavraC = new StringBuilder(palavraC).reverse().toString();
		System.out.println ("A palavra contrário é: "+palavraC);
		
		Integer tamanho = palavraC.length();
		
		System.out.println("O tamanho da palavra é "+tamanho);
	}

}
