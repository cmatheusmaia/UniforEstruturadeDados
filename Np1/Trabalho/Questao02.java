package Trabalho;

import java.util.Scanner;

public class Questao02 {
	Scanner entrada = new Scanner(System.in);
	int valorMetros;
	
	System.out.println("Informe o valor em Metros");
	System.out.println("1 - Quilômetro (KM)");
	System.out.println("2 - Hectômetro (HM)");
	System.out.println("3 - Decâmetro (DAM)");
	System.out.println("4 - Decimetro (DM)");
	System.out.println("5 - Centimetro (CM)");
	System.out.println("6 - Milímetro (MM)");
	valorMetros = entrada.nextInt();
	
	int opcao;
    
    do{
        opcao = entrada.nextInt();
        
        switch(opcao){
        case 1:
        	valorMetros = valorMetros /1000;
        	System.out.println("O valor em KM é: "+valorMetros);
            break;
        case 2:
        	valorMetros = valorMetros / 100;
        	System.out.println("O valor em Hectômetro é de: "+valorMetros);
            break;
        case 3:
        	valorMetros = valorMetros /10;
        	System.out.println("O valor em Decâmetro é: "+valorMetros);
            break;
        case 4:
        	valorMetros = (valorMetros * 10);
        	System.out.println("O valor em Decimetro é de: "+valorMetros);
            break;
        case 5:
        	valorMetros = (valorMetros * 100);
        	System.out.println("O valor em Centimetro é de: "+valorMetros);
            break;
        case 6:
        	valorMetros = (valorMetros * 1000);
        	System.out.println("O valor em milímetro é de: "+valorMetros);
            break;
        default:
            System.out.println("Opção inválida.");
        }
    } while(opcao != 0);
	}
}
