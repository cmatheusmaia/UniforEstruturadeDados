/*
 * solicitar como entrada um texto e exibir como resultado:
 * qtd de letras
 * qtd de caracteres
 * qtd de vogais
 * qtd de consoantes
 */
package TrabalhoEstrutura;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao05 {
		
		public static void main(String[]args){
			ChamarMetodos.AvisoAppQ5();
			String palavra;
			String qtLetras;
			int qtPalavra;
			int i;
			int qtVogais =0;
			int qtConsoantes;
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe o texto");
			palavra = entrada.next();
			
			// mostrar quantidade de caracteres presente na String
			qtPalavra = palavra.length();
			System.out.println("Quantidade de caracteres: "+qtPalavra);
			
			// mostrar quantidade de letras na String
			qtLetras = palavra.replace(" ", "");
			int qtDLetras = palavra.length();
			System.out.println("Quantidade de letras: "+qtDLetras);
			
			// mostrar quantidade de consoantes na string
			for (i = 0;i <palavra.length();i++){
						if(palavra.charAt(i) == 'a'
			|| palavra.charAt(i) == 'e'
			|| palavra.charAt(i) == 'i'
			|| palavra.charAt(i) == 'o'
			|| palavra.charAt(i) == 'u'
			|| palavra.charAt(i) == 'A'
			|| palavra.charAt(i) == 'E'
			|| palavra.charAt(i) == 'I'
			|| palavra.charAt(i) == 'O'
			|| palavra.charAt(i) == 'U'){
				qtVogais +=1;
			}
		}
			int qtAlfabeth = palavra.length();
			qtConsoantes = qtAlfabeth - qtVogais;
			
			System.out.println("Quantidade de consoantes: "+qtConsoantes);
			System.out.println("Quantidade de vogais: "+qtVogais);
	}
}
	
