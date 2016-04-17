package ListaExercicio2;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main (String...arg){
		
			Scanner entrada = new Scanner (System.in);
			float peso;
			float altura = 0;
			float calculo;
			
			System.out.println("Informe o peso");
			peso = entrada.nextFloat();
			System.out.println("Informe a altura");
			altura = entrada.nextFloat();
			
			calculo = peso/(altura * altura);
			
			if(calculo < 20){
				System.out.println("Você está magro, seu IMC é igual a: "+calculo);
			}else{
				if (calculo < 25){
					System.out.println("Seu peso está ideal e seu IMC é de: "+calculo);
				}else {
					if(calculo < 30){
						System.out.println("Seu peso está acima do normal e seu IMC é de: "+calculo);
					}else{
						if(calculo < 40){
							System.out.println("Você está com obsidade nivel 1 e seu IMC é de: "+calculo);
						}else{
							System.out.println("Você está com a obsidade grau 2 e o IMC é de: "+calculo);
						}
					}
							
				}
			}						
	}}
