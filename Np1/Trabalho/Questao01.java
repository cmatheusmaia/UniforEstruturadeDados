package Trabalho;

import java.util.Scanner;

public class Questao01 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		String nome;
		Double peso;
		Double altura;
		Double imc;
		int opcaoEscolha;
		
		System.out.println("Informe seu nome:");
		nome = entrada.next();
		System.out.println("Olá "+nome+" como vai? Informe agora seu peso:");
		peso = entrada.nextDouble();
		System.out.println("informe agora "+nome+" sua altura em metros, ex. 1,78");
		altura = entrada.nextDouble();
		
		System.out.println("Qual seu sexo?");
		System.out.println("[ 1 ] - HOMEM");
		System.out.println("[ 2 ] - MULHER");		
		opcaoEscolha = (int) entrada.nextFloat();
		
		imc = peso / (altura * altura);
		
		switch( opcaoEscolha )
        {
            case 1:
            	if(imc  < 20.7){
            		System.out.println(nome+" seu IMC é "+imc+" e você está abaixo do peso.");
            	}else{
            		if(imc < 26.4){
            			System.out.println(nome+" seu IMC é "+imc+" e você está no peso ideal");
            		}else{
            			if(imc < 31.1){
            				System.out.println(nome+" seu IMC é "+imc+" e você está acima do peso");
            			}else{
            				if(imc > 31){
            					System.out.println(nome+" seu IMC é "+imc+" e você está obeso");
            				}
            			}
            		}
            	}
            case 2:
            	if(imc  < 19.1){
            		System.out.println(nome+" seu IMC é "+imc+" e você está abaixo do peso.");
            	}else{
            		if(imc < 25.8){
            			System.out.println(nome+" seu IMC é "+imc+" e você está no peso ideal");
            		}else{
            			if(imc < 27.3){
            				System.out.println(nome+" seu IMC é "+imc+" e você está acima do peso");
            			}else{
            				if(imc > 32.3){
            					System.out.println(nome+" seu IMC é "+imc+" e você está obeso");
            				}
            			}
            		}
            	}
            default: 
            	System.out.println("opção inválida");
            	
        }
		
	}
	
}
