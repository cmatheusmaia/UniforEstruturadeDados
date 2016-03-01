package ListadeExercicio;

import java.util.Scanner;

public class Questao06i {

	public static void main (String...arg){
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade");
		idade = entrada.nextInt();
		
		if ((idade> 5) && (idade <7)){
			System.out.println("Infantil A --- de 5 a 7 anos");
		}else{
			if((idade > 8) && (idade <10)){
				System.out.println("Infantil B --- de 8 a 10 anos ");
			}else{
				if((idade > 11) && (idade < 13)){
					System.out.println("Juvenil A --- de 11 a 13 anos ");
				}else{
					if((idade > 14) && (idade < 17)){
						System.out.println("Juvenil B --- de 14 a 17 anos ");
					}else{
						if(idade > 17 ){
							System.out.println("Sênior --- maiores de 17 anos");
						}
					}
				}
			}
		}
	}
	
}
